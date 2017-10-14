package aed.recursion;

import aed.positionlist.*;

/**
 * Defines a number of recursive methods.
 */
public class RecursiveMethods {

	/**
	 * Calculates a^n using recursion. It is assumed that n>=0.
	 * 
	 * @return a^n.
	 */
	public static int power(int a, int n) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return a;
		} else if (n % 2 == 0) {
			return power(a * a, n / 2);
		} else {
			return a * power(a, n - 1);
		}
	}

	/**
	 * Returns the indice of a peak element in arr. It is assumed that arr is
	 * not empty.
	 */
	static private int findPeakAux(MyInteger[] arr, int min, int max) {

		int mitad = (max + min) / 2;
		if (max - min == 1) {
			if (arr[max].compareTo(arr[min]) >= 0) {
				return max;
			} else {
				return min;
			}
		} else if (arr[mitad].compareTo(arr[mitad + 1]) <= 0) {
			return findPeakAux(arr, mitad, max);
		} else if (arr[mitad].compareTo(arr[mitad - 1]) <= 0) {
			return findPeakAux(arr, min, mitad);
		} else {
			return mitad;
		}
	}

	static public int findPeak(MyInteger[] arr) {
		int minimo = 0;
		int maximo = arr.length;
		if (maximo == 1) {
			return 0;
		} else {
			return findPeakAux(arr, minimo, maximo - 1);
		}
	}

	/**
	 * Returns a new list corresponding to the multiset which is the result of
	 * merging the multiset arguments l1 and l2. It is assumed that l1 and l2
	 * are sorted in ascending order, and it is required that the result is
	 * sorted in ascending order.
	 */
	static private void addPairAux(PositionList<Pair<Integer, Integer>> lista,
			Position<Pair<Integer, Integer>> cursor) {
		
		if (lista.last() == null) {
			Pair<Integer, Integer> par = new Pair<Integer, Integer>(cursor.element().getLeft(),
					cursor.element().getRight());
			lista.addLast(par);
		} else {
			if (lista.last().element().getLeft().compareTo(cursor.element().getLeft()) == 0) {
				lista.last().element().setRight(lista.last().element().getRight() + cursor.element().getRight());
			} else {
				Pair<Integer, Integer> par = new Pair<Integer, Integer>(cursor.element().getLeft(),
						cursor.element().getRight());
				lista.addLast(par);
			}
		}
	}

	static private PositionList<Pair<Integer, Integer>> mergeMultisetsAux(PositionList<Pair<Integer, Integer>> lista1,
			PositionList<Pair<Integer, Integer>> lista2, PositionList<Pair<Integer, Integer>> lista,
			Position<Pair<Integer, Integer>> cursor1, Position<Pair<Integer, Integer>> cursor2) {

		if (cursor1 == null && cursor2 == null) {
			return lista;
		} else if (cursor1 != null && cursor2 != null) {
			if (cursor1.element().getLeft().compareTo(cursor2.element().getLeft()) == 0) {
				Pair<Integer, Integer> par = new Pair<Integer, Integer>(cursor1.element().getLeft(),
						cursor1.element().getRight() + cursor2.element().getRight());
				lista.addLast(par);
				cursor1 = lista1.next(cursor1);
				cursor2 = lista2.next(cursor2);
			} else if (cursor1.element().getLeft().compareTo(cursor2.element().getLeft()) < 0) {
				addPairAux(lista, cursor1);
				cursor1 = lista1.next(cursor1);
			} else {
				addPairAux(lista, cursor2);
				cursor2 = lista2.next(cursor2);
			}
		} else if (cursor1 != null && cursor2 == null) {
			addPairAux(lista, cursor1);
			cursor1 = lista1.next(cursor1);

		} else if (cursor1 == null && cursor2 != null) {
			addPairAux(lista, cursor2);
			cursor2 = lista2.next(cursor2);
		}
		mergeMultisetsAux(lista1, lista2, lista, cursor1, cursor2);
		return lista;
	}

	static public PositionList<Pair<Integer, Integer>> mergeMultisets(PositionList<Pair<Integer, Integer>> l1,
			PositionList<Pair<Integer, Integer>> l2) {
		PositionList<Pair<Integer, Integer>> lista = new NodePositionList<Pair<Integer, Integer>>();
		if (l1.isEmpty() && l2.isEmpty()) {
			return lista;
		} else {
			Position<Pair<Integer, Integer>> cursor1 = l1.first();
			Position<Pair<Integer, Integer>> cursor2 = l2.first();
			return mergeMultisetsAux(l1, l2, lista, cursor1, cursor2);
		}
	}
}
