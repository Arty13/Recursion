package aed.recursion;

public class MyInteger implements Comparable<MyInteger> {
	static long counter = 0;
	Integer value;

	public MyInteger(int value) {
		this.value = value;
	}

	public static MyInteger[] array(Integer[] array) {
		MyInteger[] arr = new MyInteger[array.length];
		for (int i=0; i<array.length; i++) {
			if (array[i] == null) arr[i]=null;
			else arr[i] = new MyInteger(array[i]);
		}
		return arr;
	}

	public static void setCounter(long value) {
		counter = value;
	}

	public static long getCounter() {
		return counter;
	}

	public Integer value() {
		return value;
	}

        public int compareTo(MyInteger other) {
	    ++counter;
	    return this.value().compareTo(other.value());
        }

	public boolean equals(Object obj) {
	    ++counter;

	    if (obj instanceof MyInteger)
		return value.equals(((MyInteger) obj).value());
	    else
		return false;
	}

	public int hashCode() {
		return value.hashCode();
	}

	public String toString() {
		if (value == null) return "null";
		else return value.toString();
	}
}
