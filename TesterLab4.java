/*
 * Teachers: WARNING - this file is generated automatically, please do not
 * changes directly in this file, instead communicate needed changes
 * to the person responsable for the Tester.
 *
 * Students: you are welcome to make changes to this file if it helps
 * you to better debug your programs. Just REMEMBER that any changes made
 * by you will not change the Tester program used for the "entrega system".
 *
 */

package aed.recursion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.management.ManagementFactory;

import aed.positionlist.*;

import org.apache.bcel.classfile.*;

import java.util.Map;
import java.util.Set;
import java.util.Hashtable;
import java.util.TreeSet;

import java.lang.reflect.Field;


public class TesterLab4 {

  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String testName;
  static String callSeq="";

  public static void main(String[] args) {

    try {
	String[] ids = ManagementFactory.getRuntimeMXBean().getName().split("@");
	BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
	bw.write(ids[0]);
	bw.close();
    } catch (Exception e) {
	System.out.println("Avisa al profesor de fallo sacando el PID");
    }

    boolean[] results_sofar = {true,true,true};
    boolean[] general_results = {false,false,false};
    
    

    try {
    general_results =
      combine_general_result("rec_power", checkRecursive("aed.recursion.RecursiveMethods.power"), general_results);

    general_results =
      combine_general_result("rec_peak", checkRecursive("aed.recursion.RecursiveMethods.findPeak"), general_results);

    general_results =
      combine_general_result("rec_merge_lists", checkRecursive("aed.recursion.RecursiveMethods.mergeMultisets"), general_results);

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_1(), results_sofar, "test_1", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_2(), results_sofar, "test_2", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_3(), results_sofar, "test_3", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_4(), results_sofar, "test_4", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_5(), results_sofar, "test_5", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_6(), results_sofar, "test_6", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_7(), results_sofar, "test_7", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_8(), results_sofar, "test_8", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_9(), results_sofar, "test_9", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_10(), results_sofar, "test_10", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_11(), results_sofar, "test_11", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_12(), results_sofar, "test_12", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_13(), results_sofar, "test_13", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_14(), results_sofar, "test_14", "power");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_15(), results_sofar, "test_15", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_16(), results_sofar, "test_16", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_17(), results_sofar, "test_17", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_18(), results_sofar, "test_18", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_19(), results_sofar, "test_19", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_20(), results_sofar, "test_20", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_21(), results_sofar, "test_21", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_22(), results_sofar, "test_22", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_23(), results_sofar, "test_23", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_24(), results_sofar, "test_24", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_25(), results_sofar, "test_25", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_26(), results_sofar, "test_26", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_27(), results_sofar, "test_27", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_28(), results_sofar, "test_28", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_29(), results_sofar, "test_29", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_30(), results_sofar, "test_30", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_31(), results_sofar, "test_31", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_32(), results_sofar, "test_32", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_33(), results_sofar, "test_33", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_34(), results_sofar, "test_34", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_35(), results_sofar, "test_35", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_36(), results_sofar, "test_36", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_37(), results_sofar, "test_37", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_38(), results_sofar, "test_38", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_39(), results_sofar, "test_39", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_40(), results_sofar, "test_40", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_41(), results_sofar, "test_41", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_42(), results_sofar, "test_42", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_43(), results_sofar, "test_43", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_44(), results_sofar, "test_44", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_45(), results_sofar, "test_45", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_46(), results_sofar, "test_46", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_47(), results_sofar, "test_47", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_48(), results_sofar, "test_48", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_49(), results_sofar, "test_49", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_50(), results_sofar, "test_50", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_51(), results_sofar, "test_51", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_52(), results_sofar, "test_52", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_53(), results_sofar, "test_53", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_54(), results_sofar, "test_54", "peaksearch");

      if (results_ok_sofar(results_sofar,"peaksearch") && local_results_ok_sofar(results_sofar,"peaksearch"))
        results_sofar =
          combine_results(test_55(), results_sofar, "test_55", "peaksearch");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_56(), results_sofar, "test_56", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_57(), results_sofar, "test_57", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_58(), results_sofar, "test_58", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_59(), results_sofar, "test_59", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_60(), results_sofar, "test_60", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_61(), results_sofar, "test_61", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_62(), results_sofar, "test_62", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_63(), results_sofar, "test_63", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_64(), results_sofar, "test_64", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_65(), results_sofar, "test_65", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_66(), results_sofar, "test_66", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_67(), results_sofar, "test_67", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_68(), results_sofar, "test_68", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_69(), results_sofar, "test_69", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_70(), results_sofar, "test_70", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_71(), results_sofar, "test_71", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_72(), results_sofar, "test_72", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_73(), results_sofar, "test_73", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_74(), results_sofar, "test_74", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_75(), results_sofar, "test_75", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_76(), results_sofar, "test_76", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_77(), results_sofar, "test_77", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_78(), results_sofar, "test_78", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_79(), results_sofar, "test_79", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_80(), results_sofar, "test_80", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_81(), results_sofar, "test_81", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_82(), results_sofar, "test_82", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_83(), results_sofar, "test_83", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_84(), results_sofar, "test_84", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_85(), results_sofar, "test_85", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_86(), results_sofar, "test_86", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_87(), results_sofar, "test_87", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_88(), results_sofar, "test_88", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_89(), results_sofar, "test_89", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_90(), results_sofar, "test_90", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_91(), results_sofar, "test_91", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_92(), results_sofar, "test_92", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_93(), results_sofar, "test_93", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_94(), results_sofar, "test_94", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_95(), results_sofar, "test_95", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_96(), results_sofar, "test_96", "mergemultisets");

      if (results_ok_sofar(results_sofar,"mergemultisets") && local_results_ok_sofar(results_sofar,"mergemultisets"))
        results_sofar =
          combine_results(test_97(), results_sofar, "test_97", "mergemultisets");

    } catch ( Throwable exc ) {
          printCallException(ExecutionTime.DURING,"",exc);
          System.exit(24);
      }


    report_results("TesterLab4",results_sofar,general_results);


    if (results_ok(results_sofar,general_results))
      System.exit(0);
    else
      System.exit(24);
  }



  private static boolean test_1 ()
  {
      
      testName = "test_1" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPower(0,13,0) ;
      return ok_sofar ;
  }


  private static boolean test_2 ()
  {
      
      testName = "test_2" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPower(0,2,0) ;
      return ok_sofar ;
  }


  private static boolean test_3 ()
  {
      
      testName = "test_3" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPower(0,1,0) ;
      return ok_sofar ;
  }


  private static boolean test_4 ()
  {
      
      testName = "test_4" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPower(7,0,1) ;
      return ok_sofar ;
  }


  private static boolean test_5 ()
  {
      
      testName = "test_5" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPower(13,0,1) ;
      return ok_sofar ;
  }


  private static boolean test_6 ()
  {
      
      testName = "test_6" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPower(0,0,1) ;
      return ok_sofar ;
  }


  private static boolean test_7 ()
  {
      
      testName = "test_7" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPower(1,0,1) ;
      return ok_sofar ;
  }


  private static boolean test_8 ()
  {
      
      testName = "test_8" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPower(1,1,1) ;
      return ok_sofar ;
  }


  private static boolean test_9 ()
  {
      
      testName = "test_9" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPower(5,4,625) ;
      return ok_sofar ;
  }


  private static boolean test_10 ()
  {
      
      testName = "test_10" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPower(4,5,1024) ;
      return ok_sofar ;
  }


  private static boolean test_11 ()
  {
      
      testName = "test_11" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPower(2,11,2048) ;
      return ok_sofar ;
  }


  private static boolean test_12 ()
  {
      
      testName = "test_12" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPower(7,6,117649) ;
      return ok_sofar ;
  }


  private static boolean test_13 ()
  {
      
      testName = "test_13" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPower(8,7,2097152) ;
      return ok_sofar ;
  }


  private static boolean test_14 ()
  {
      
      testName = "test_14" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPower(12,6,2985984) ;
      return ok_sofar ;
  }


  private static boolean test_15 ()
  {
      
      testName = "test_15" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(15) },new Integer[] { new Integer(0) }) ;
      return ok_sofar ;
  }


  private static boolean test_16 ()
  {
      
      testName = "test_16" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(4) },new Integer[] { new Integer(0) }) ;
      return ok_sofar ;
  }


  private static boolean test_17 ()
  {
      
      testName = "test_17" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(0) },new Integer[] { new Integer(0) }) ;
      return ok_sofar ;
  }


  private static boolean test_18 ()
  {
      
      testName = "test_18" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(4),new Integer(35) },new Integer[] { new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_19 ()
  {
      
      testName = "test_19" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(10),new Integer(17) },new Integer[] { new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_20 ()
  {
      
      testName = "test_20" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(6),new Integer(2) },new Integer[] { new Integer(0) }) ;
      return ok_sofar ;
  }


  private static boolean test_21 ()
  {
      
      testName = "test_21" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(10),new Integer(8) },new Integer[] { new Integer(0) }) ;
      return ok_sofar ;
  }


  private static boolean test_22 ()
  {
      
      testName = "test_22" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(1),new Integer(1) },new Integer[] { new Integer(0),new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_23 ()
  {
      
      testName = "test_23" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(22),new Integer(22),new Integer(5) },new Integer[] { new Integer(0),new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_24 ()
  {
      
      testName = "test_24" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(1),new Integer(4),new Integer(13) },new Integer[] { new Integer(2) }) ;
      return ok_sofar ;
  }


  private static boolean test_25 ()
  {
      
      testName = "test_25" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(11),new Integer(6),new Integer(4) },new Integer[] { new Integer(0) }) ;
      return ok_sofar ;
  }


  private static boolean test_26 ()
  {
      
      testName = "test_26" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(6),new Integer(7),new Integer(8) },new Integer[] { new Integer(2) }) ;
      return ok_sofar ;
  }


  private static boolean test_27 ()
  {
      
      testName = "test_27" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(1),new Integer(1),new Integer(1) },new Integer[] { new Integer(0),new Integer(1),new Integer(2) }) ;
      return ok_sofar ;
  }


  private static boolean test_28 ()
  {
      
      testName = "test_28" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(0),new Integer(0),new Integer(1) },new Integer[] { new Integer(0),new Integer(2) }) ;
      return ok_sofar ;
  }


  private static boolean test_29 ()
  {
      
      testName = "test_29" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(1),new Integer(2),new Integer(3) },new Integer[] { new Integer(2) }) ;
      return ok_sofar ;
  }


  private static boolean test_30 ()
  {
      
      testName = "test_30" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(2),new Integer(3),new Integer(1) },new Integer[] { new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_31 ()
  {
      
      testName = "test_31" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(3),new Integer(2),new Integer(1) },new Integer[] { new Integer(0) }) ;
      return ok_sofar ;
  }


  private static boolean test_32 ()
  {
      
      testName = "test_32" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(2),new Integer(1),new Integer(3) },new Integer[] { new Integer(0),new Integer(2) }) ;
      return ok_sofar ;
  }


  private static boolean test_33 ()
  {
      
      testName = "test_33" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(1),new Integer(3),new Integer(2) },new Integer[] { new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_34 ()
  {
      
      testName = "test_34" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(100231),new Integer(100231),new Integer(100231) },new Integer[] { new Integer(0),new Integer(1),new Integer(2) }) ;
      return ok_sofar ;
  }


  private static boolean test_35 ()
  {
      
      testName = "test_35" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(2),new Integer(12),new Integer(13),new Integer(18) },new Integer[] { new Integer(3) }) ;
      return ok_sofar ;
  }


  private static boolean test_36 ()
  {
      
      testName = "test_36" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(0),new Integer(8),new Integer(12),new Integer(16) },new Integer[] { new Integer(3) }) ;
      return ok_sofar ;
  }


  private static boolean test_37 ()
  {
      
      testName = "test_37" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(8),new Integer(7),new Integer(7),new Integer(17) },new Integer[] { new Integer(0),new Integer(3) }) ;
      return ok_sofar ;
  }


  private static boolean test_38 ()
  {
      
      testName = "test_38" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(1),new Integer(2),new Integer(3),new Integer(100231) },new Integer[] { new Integer(3) }) ;
      return ok_sofar ;
  }


  private static boolean test_39 ()
  {
      
      testName = "test_39" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(17),new Integer(4),new Integer(2),new Integer(7),new Integer(14) },new Integer[] { new Integer(0),new Integer(4) }) ;
      return ok_sofar ;
  }


  private static boolean test_40 ()
  {
      
      testName = "test_40" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(7),new Integer(1),new Integer(6),new Integer(23),new Integer(12) },new Integer[] { new Integer(0),new Integer(3) }) ;
      return ok_sofar ;
  }


  private static boolean test_41 ()
  {
      
      testName = "test_41" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(0),new Integer(0),new Integer(4),new Integer(15),new Integer(4) },new Integer[] { new Integer(0),new Integer(3) }) ;
      return ok_sofar ;
  }


  private static boolean test_42 ()
  {
      
      testName = "test_42" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(13),new Integer(13),new Integer(6),new Integer(6),new Integer(4) },new Integer[] { new Integer(0),new Integer(1),new Integer(3) }) ;
      return ok_sofar ;
  }


  private static boolean test_43 ()
  {
      
      testName = "test_43" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(26),new Integer(1),new Integer(25),new Integer(8),new Integer(34),new Integer(14) },new Integer[] { new Integer(0),new Integer(2),new Integer(4) }) ;
      return ok_sofar ;
  }


  private static boolean test_44 ()
  {
      
      testName = "test_44" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(19),new Integer(11),new Integer(7),new Integer(13),new Integer(3),new Integer(2) },new Integer[] { new Integer(0),new Integer(3) }) ;
      return ok_sofar ;
  }


  private static boolean test_45 ()
  {
      
      testName = "test_45" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(9),new Integer(20),new Integer(22),new Integer(15),new Integer(12),new Integer(20) },new Integer[] { new Integer(2),new Integer(5) }) ;
      return ok_sofar ;
  }


  private static boolean test_46 ()
  {
      
      testName = "test_46" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(6),new Integer(11),new Integer(6),new Integer(16),new Integer(5),new Integer(3) },new Integer[] { new Integer(1),new Integer(3) }) ;
      return ok_sofar ;
  }


  private static boolean test_47 ()
  {
      
      testName = "test_47" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(3),new Integer(21),new Integer(15),new Integer(3),new Integer(5),new Integer(5),new Integer(26) },new Integer[] { new Integer(1),new Integer(4),new Integer(6) }) ;
      return ok_sofar ;
  }


  private static boolean test_48 ()
  {
      
      testName = "test_48" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(16),new Integer(12),new Integer(22),new Integer(14),new Integer(5),new Integer(26),new Integer(18) },new Integer[] { new Integer(0),new Integer(2),new Integer(5) }) ;
      return ok_sofar ;
  }


  private static boolean test_49 ()
  {
      
      testName = "test_49" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(30),new Integer(29),new Integer(10),new Integer(26),new Integer(23),new Integer(23),new Integer(23),new Integer(19) },new Integer[] { new Integer(0),new Integer(3),new Integer(5),new Integer(6) }) ;
      return ok_sofar ;
  }


  private static boolean test_50 ()
  {
      
      testName = "test_50" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(4),new Integer(26),new Integer(7),new Integer(5),new Integer(8),new Integer(8),new Integer(11),new Integer(18) },new Integer[] { new Integer(1),new Integer(4),new Integer(7) }) ;
      return ok_sofar ;
  }


  private static boolean test_51 ()
  {
      
      testName = "test_51" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(0),new Integer(1),new Integer(10),new Integer(20),new Integer(7),new Integer(20),new Integer(24),new Integer(12) },new Integer[] { new Integer(3),new Integer(6) }) ;
      return ok_sofar ;
  }


  private static boolean test_52 ()
  {
      
      testName = "test_52" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(34),new Integer(0),new Integer(3),new Integer(27),new Integer(8),new Integer(3),new Integer(29),new Integer(18),new Integer(27) },new Integer[] { new Integer(0),new Integer(3),new Integer(6),new Integer(8) }) ;
      return ok_sofar ;
  }


  private static boolean test_53 ()
  {
      
      testName = "test_53" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(15),new Integer(11),new Integer(22),new Integer(2),new Integer(11),new Integer(6),new Integer(22),new Integer(27),new Integer(14) },new Integer[] { new Integer(0),new Integer(2),new Integer(4),new Integer(7) }) ;
      return ok_sofar ;
  }


  private static boolean test_54 ()
  {
      
      testName = "test_54" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(8),new Integer(8),new Integer(15),new Integer(20),new Integer(29),new Integer(35),new Integer(11),new Integer(34),new Integer(19),new Integer(17),new Integer(5) },new Integer[] { new Integer(0),new Integer(5),new Integer(7) }) ;
      return ok_sofar ;
  }


  private static boolean test_55 ()
  {
      
      testName = "test_55" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkPeakSearch(new Integer[] { new Integer(14),new Integer(18),new Integer(31),new Integer(12),new Integer(7),new Integer(22),new Integer(33),new Integer(32),new Integer(26),new Integer(25),new Integer(14),new Integer(9) },new Integer[] { new Integer(2),new Integer(6) }) ;
      return ok_sofar ;
  }


  private static boolean test_56 ()
  {
      
      testName = "test_56" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] {  },new Integer[] {  },new Integer[] {  },new Integer[] {  },new Integer[] {  },new Integer[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_57 ()
  {
      
      testName = "test_57" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(0) },new Integer[] { new Integer(1) },new Integer[] {  },new Integer[] {  },new Integer[] { new Integer(0) },new Integer[] { new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_58 ()
  {
      
      testName = "test_58" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] {  },new Integer[] {  },new Integer[] { new Integer(1) },new Integer[] { new Integer(1) },new Integer[] { new Integer(1) },new Integer[] { new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_59 ()
  {
      
      testName = "test_59" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(1) },new Integer[] { new Integer(1) },new Integer[] {  },new Integer[] {  },new Integer[] { new Integer(1) },new Integer[] { new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_60 ()
  {
      
      testName = "test_60" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] {  },new Integer[] {  },new Integer[] { new Integer(6),new Integer(23) },new Integer[] { new Integer(1),new Integer(1) },new Integer[] { new Integer(6),new Integer(23) },new Integer[] { new Integer(1),new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_61 ()
  {
      
      testName = "test_61" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(0) },new Integer[] { new Integer(2) },new Integer[] {  },new Integer[] {  },new Integer[] { new Integer(0) },new Integer[] { new Integer(2) }) ;
      return ok_sofar ;
  }


  private static boolean test_62 ()
  {
      
      testName = "test_62" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(7) },new Integer[] { new Integer(1) },new Integer[] { new Integer(0) },new Integer[] { new Integer(1) },new Integer[] { new Integer(0),new Integer(7) },new Integer[] { new Integer(1),new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_63 ()
  {
      
      testName = "test_63" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(1) },new Integer[] { new Integer(2) },new Integer[] {  },new Integer[] {  },new Integer[] { new Integer(1) },new Integer[] { new Integer(2) }) ;
      return ok_sofar ;
  }


  private static boolean test_64 ()
  {
      
      testName = "test_64" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] {  },new Integer[] {  },new Integer[] { new Integer(0) },new Integer[] { new Integer(2) },new Integer[] { new Integer(0) },new Integer[] { new Integer(2) }) ;
      return ok_sofar ;
  }


  private static boolean test_65 ()
  {
      
      testName = "test_65" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(1) },new Integer[] { new Integer(1) },new Integer[] { new Integer(0) },new Integer[] { new Integer(1) },new Integer[] { new Integer(0),new Integer(1) },new Integer[] { new Integer(1),new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_66 ()
  {
      
      testName = "test_66" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(0) },new Integer[] { new Integer(1) },new Integer[] { new Integer(1) },new Integer[] { new Integer(1) },new Integer[] { new Integer(0),new Integer(1) },new Integer[] { new Integer(1),new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_67 ()
  {
      
      testName = "test_67" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(10) },new Integer[] { new Integer(1) },new Integer[] { new Integer(2),new Integer(14) },new Integer[] { new Integer(1),new Integer(1) },new Integer[] { new Integer(2),new Integer(10),new Integer(14) },new Integer[] { new Integer(1),new Integer(1),new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_68 ()
  {
      
      testName = "test_68" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] {  },new Integer[] {  },new Integer[] { new Integer(1),new Integer(2),new Integer(3) },new Integer[] { new Integer(1),new Integer(1),new Integer(1) },new Integer[] { new Integer(1),new Integer(2),new Integer(3) },new Integer[] { new Integer(1),new Integer(1),new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_69 ()
  {
      
      testName = "test_69" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] {  },new Integer[] {  },new Integer[] { new Integer(0),new Integer(1),new Integer(2),new Integer(34) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(1) },new Integer[] { new Integer(0),new Integer(1),new Integer(2),new Integer(34) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_70 ()
  {
      
      testName = "test_70" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(13),new Integer(25) },new Integer[] { new Integer(1),new Integer(1) },new Integer[] { new Integer(4),new Integer(16) },new Integer[] { new Integer(1),new Integer(1) },new Integer[] { new Integer(4),new Integer(13),new Integer(16),new Integer(25) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_71 ()
  {
      
      testName = "test_71" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(1),new Integer(16) },new Integer[] { new Integer(1),new Integer(2) },new Integer[] { new Integer(15) },new Integer[] { new Integer(1) },new Integer[] { new Integer(1),new Integer(15),new Integer(16) },new Integer[] { new Integer(1),new Integer(1),new Integer(2) }) ;
      return ok_sofar ;
  }


  private static boolean test_72 ()
  {
      
      testName = "test_72" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(4),new Integer(6) },new Integer[] { new Integer(1),new Integer(1) },new Integer[] { new Integer(1),new Integer(7) },new Integer[] { new Integer(1),new Integer(1) },new Integer[] { new Integer(1),new Integer(4),new Integer(6),new Integer(7) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_73 ()
  {
      
      testName = "test_73" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(2),new Integer(4),new Integer(10) },new Integer[] { new Integer(1),new Integer(1),new Integer(1) },new Integer[] { new Integer(3) },new Integer[] { new Integer(1) },new Integer[] { new Integer(2),new Integer(3),new Integer(4),new Integer(10) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_74 ()
  {
      
      testName = "test_74" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(0) },new Integer[] { new Integer(2) },new Integer[] { new Integer(1) },new Integer[] { new Integer(2) },new Integer[] { new Integer(0),new Integer(1) },new Integer[] { new Integer(2),new Integer(2) }) ;
      return ok_sofar ;
  }


  private static boolean test_75 ()
  {
      
      testName = "test_75" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(1) },new Integer[] { new Integer(2) },new Integer[] { new Integer(0) },new Integer[] { new Integer(2) },new Integer[] { new Integer(0),new Integer(1) },new Integer[] { new Integer(2),new Integer(2) }) ;
      return ok_sofar ;
  }


  private static boolean test_76 ()
  {
      
      testName = "test_76" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(1) },new Integer[] { new Integer(2) },new Integer[] { new Integer(1) },new Integer[] { new Integer(2) },new Integer[] { new Integer(1) },new Integer[] { new Integer(4) }) ;
      return ok_sofar ;
  }


  private static boolean test_77 ()
  {
      
      testName = "test_77" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(5),new Integer(6),new Integer(7),new Integer(10),new Integer(13) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1) },new Integer[] { new Integer(11),new Integer(13) },new Integer[] { new Integer(1),new Integer(1) },new Integer[] { new Integer(5),new Integer(6),new Integer(7),new Integer(10),new Integer(11),new Integer(13) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(2) }) ;
      return ok_sofar ;
  }


  private static boolean test_78 ()
  {
      
      testName = "test_78" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(0),new Integer(1),new Integer(2) },new Integer[] { new Integer(2),new Integer(2),new Integer(3) },new Integer[] {  },new Integer[] {  },new Integer[] { new Integer(0),new Integer(1),new Integer(2) },new Integer[] { new Integer(2),new Integer(2),new Integer(3) }) ;
      return ok_sofar ;
  }


  private static boolean test_79 ()
  {
      
      testName = "test_79" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(1) },new Integer[] { new Integer(1) },new Integer[] { new Integer(2),new Integer(5),new Integer(9),new Integer(22),new Integer(23),new Integer(26),new Integer(31) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1) },new Integer[] { new Integer(1),new Integer(2),new Integer(5),new Integer(9),new Integer(22),new Integer(23),new Integer(26),new Integer(31) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_80 ()
  {
      
      testName = "test_80" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(3),new Integer(19) },new Integer[] { new Integer(1),new Integer(1) },new Integer[] { new Integer(6),new Integer(7),new Integer(11),new Integer(19),new Integer(21) },new Integer[] { new Integer(2),new Integer(1),new Integer(1),new Integer(1),new Integer(1) },new Integer[] { new Integer(3),new Integer(6),new Integer(7),new Integer(11),new Integer(19),new Integer(21) },new Integer[] { new Integer(1),new Integer(2),new Integer(1),new Integer(1),new Integer(2),new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_81 ()
  {
      
      testName = "test_81" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(9),new Integer(12),new Integer(17) },new Integer[] { new Integer(1),new Integer(1),new Integer(1) },new Integer[] { new Integer(0),new Integer(1),new Integer(7),new Integer(20) },new Integer[] { new Integer(1),new Integer(1),new Integer(2),new Integer(1) },new Integer[] { new Integer(0),new Integer(1),new Integer(7),new Integer(9),new Integer(12),new Integer(17),new Integer(20) },new Integer[] { new Integer(1),new Integer(1),new Integer(2),new Integer(1),new Integer(1),new Integer(1),new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_82 ()
  {
      
      testName = "test_82" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(1),new Integer(5),new Integer(6),new Integer(11) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(2) },new Integer[] { new Integer(7),new Integer(14),new Integer(16) },new Integer[] { new Integer(1),new Integer(1),new Integer(1) },new Integer[] { new Integer(1),new Integer(5),new Integer(6),new Integer(7),new Integer(11),new Integer(14),new Integer(16) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(2),new Integer(1),new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_83 ()
  {
      
      testName = "test_83" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(17),new Integer(19) },new Integer[] { new Integer(1),new Integer(1) },new Integer[] { new Integer(0),new Integer(6),new Integer(12),new Integer(19),new Integer(20),new Integer(22),new Integer(24) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1) },new Integer[] { new Integer(0),new Integer(6),new Integer(12),new Integer(17),new Integer(19),new Integer(20),new Integer(22),new Integer(24) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(2),new Integer(1),new Integer(1),new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_84 ()
  {
      
      testName = "test_84" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(0),new Integer(3),new Integer(4),new Integer(5) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(1) },new Integer[] { new Integer(1),new Integer(4),new Integer(5),new Integer(7),new Integer(14) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1) },new Integer[] { new Integer(0),new Integer(1),new Integer(3),new Integer(4),new Integer(5),new Integer(7),new Integer(14) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(2),new Integer(2),new Integer(1),new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_85 ()
  {
      
      testName = "test_85" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(17),new Integer(29) },new Integer[] { new Integer(1),new Integer(1) },new Integer[] { new Integer(2),new Integer(4),new Integer(10),new Integer(11),new Integer(19),new Integer(26),new Integer(29) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(2) },new Integer[] { new Integer(2),new Integer(4),new Integer(10),new Integer(11),new Integer(17),new Integer(19),new Integer(26),new Integer(29) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(3) }) ;
      return ok_sofar ;
  }


  private static boolean test_86 ()
  {
      
      testName = "test_86" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(0),new Integer(13),new Integer(17) },new Integer[] { new Integer(1),new Integer(1),new Integer(2) },new Integer[] { new Integer(1),new Integer(3),new Integer(10),new Integer(18) },new Integer[] { new Integer(1),new Integer(2),new Integer(1),new Integer(2) },new Integer[] { new Integer(0),new Integer(1),new Integer(3),new Integer(10),new Integer(13),new Integer(17),new Integer(18) },new Integer[] { new Integer(1),new Integer(1),new Integer(2),new Integer(1),new Integer(1),new Integer(2),new Integer(2) }) ;
      return ok_sofar ;
  }


  private static boolean test_87 ()
  {
      
      testName = "test_87" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(2),new Integer(8),new Integer(14),new Integer(22) },new Integer[] { new Integer(1),new Integer(2),new Integer(1),new Integer(2) },new Integer[] { new Integer(3),new Integer(10),new Integer(13),new Integer(18),new Integer(21) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1) },new Integer[] { new Integer(2),new Integer(3),new Integer(8),new Integer(10),new Integer(13),new Integer(14),new Integer(18),new Integer(21),new Integer(22) },new Integer[] { new Integer(1),new Integer(1),new Integer(2),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(2) }) ;
      return ok_sofar ;
  }


  private static boolean test_88 ()
  {
      
      testName = "test_88" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(0),new Integer(2),new Integer(10),new Integer(24),new Integer(36),new Integer(39) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1) },new Integer[] { new Integer(10),new Integer(13),new Integer(24),new Integer(33),new Integer(35) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(2),new Integer(1) },new Integer[] { new Integer(0),new Integer(2),new Integer(10),new Integer(13),new Integer(24),new Integer(33),new Integer(35),new Integer(36),new Integer(39) },new Integer[] { new Integer(1),new Integer(1),new Integer(2),new Integer(1),new Integer(2),new Integer(2),new Integer(1),new Integer(1),new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_89 ()
  {
      
      testName = "test_89" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(19),new Integer(21),new Integer(26),new Integer(27) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(1) },new Integer[] { new Integer(4),new Integer(5),new Integer(16),new Integer(20),new Integer(23),new Integer(24),new Integer(27) },new Integer[] { new Integer(2),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1) },new Integer[] { new Integer(4),new Integer(5),new Integer(16),new Integer(19),new Integer(20),new Integer(21),new Integer(23),new Integer(24),new Integer(26),new Integer(27) },new Integer[] { new Integer(2),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(2) }) ;
      return ok_sofar ;
  }


  private static boolean test_90 ()
  {
      
      testName = "test_90" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(0),new Integer(2),new Integer(14),new Integer(19),new Integer(20),new Integer(24),new Integer(25) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(2),new Integer(1),new Integer(1),new Integer(1) },new Integer[] { new Integer(13),new Integer(17),new Integer(27) },new Integer[] { new Integer(2),new Integer(1),new Integer(1) },new Integer[] { new Integer(0),new Integer(2),new Integer(13),new Integer(14),new Integer(17),new Integer(19),new Integer(20),new Integer(24),new Integer(25),new Integer(27) },new Integer[] { new Integer(1),new Integer(1),new Integer(2),new Integer(1),new Integer(1),new Integer(2),new Integer(1),new Integer(1),new Integer(1),new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_91 ()
  {
      
      testName = "test_91" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(2),new Integer(16),new Integer(17),new Integer(20) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(1) },new Integer[] { new Integer(3),new Integer(6),new Integer(11),new Integer(14),new Integer(17),new Integer(20),new Integer(22) },new Integer[] { new Integer(1),new Integer(2),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1) },new Integer[] { new Integer(2),new Integer(3),new Integer(6),new Integer(11),new Integer(14),new Integer(16),new Integer(17),new Integer(20),new Integer(22) },new Integer[] { new Integer(1),new Integer(1),new Integer(2),new Integer(1),new Integer(1),new Integer(1),new Integer(2),new Integer(2),new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_92 ()
  {
      
      testName = "test_92" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(1),new Integer(16),new Integer(17),new Integer(20),new Integer(23),new Integer(26),new Integer(27) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1) },new Integer[] { new Integer(2),new Integer(5),new Integer(10),new Integer(12),new Integer(17),new Integer(31),new Integer(32) },new Integer[] { new Integer(1),new Integer(1),new Integer(2),new Integer(1),new Integer(1),new Integer(1),new Integer(1) },new Integer[] { new Integer(1),new Integer(2),new Integer(5),new Integer(10),new Integer(12),new Integer(16),new Integer(17),new Integer(20),new Integer(23),new Integer(26),new Integer(27),new Integer(31),new Integer(32) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(2),new Integer(1),new Integer(1),new Integer(2),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_93 ()
  {
      
      testName = "test_93" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(4),new Integer(6),new Integer(7),new Integer(14),new Integer(23),new Integer(25),new Integer(33) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(4),new Integer(2),new Integer(1),new Integer(1) },new Integer[] { new Integer(2),new Integer(9),new Integer(15),new Integer(16),new Integer(21),new Integer(33) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1) },new Integer[] { new Integer(2),new Integer(4),new Integer(6),new Integer(7),new Integer(9),new Integer(14),new Integer(15),new Integer(16),new Integer(21),new Integer(23),new Integer(25),new Integer(33) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(4),new Integer(1),new Integer(1),new Integer(1),new Integer(2),new Integer(1),new Integer(2) }) ;
      return ok_sofar ;
  }


  private static boolean test_94 ()
  {
      
      testName = "test_94" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(2),new Integer(6),new Integer(7),new Integer(9),new Integer(15),new Integer(20),new Integer(21),new Integer(22),new Integer(26),new Integer(32) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(2),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1) },new Integer[] { new Integer(0),new Integer(6),new Integer(10),new Integer(15),new Integer(17),new Integer(19),new Integer(30) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1) },new Integer[] { new Integer(0),new Integer(2),new Integer(6),new Integer(7),new Integer(9),new Integer(10),new Integer(15),new Integer(17),new Integer(19),new Integer(20),new Integer(21),new Integer(22),new Integer(26),new Integer(30),new Integer(32) },new Integer[] { new Integer(1),new Integer(1),new Integer(2),new Integer(1),new Integer(1),new Integer(1),new Integer(3),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_95 ()
  {
      
      testName = "test_95" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(6),new Integer(8),new Integer(9),new Integer(10),new Integer(12),new Integer(24) },new Integer[] { new Integer(1),new Integer(2),new Integer(1),new Integer(2),new Integer(2),new Integer(1) },new Integer[] { new Integer(2),new Integer(10),new Integer(12),new Integer(15),new Integer(16),new Integer(17),new Integer(20),new Integer(23) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(2),new Integer(1),new Integer(1),new Integer(1) },new Integer[] { new Integer(2),new Integer(6),new Integer(8),new Integer(9),new Integer(10),new Integer(12),new Integer(15),new Integer(16),new Integer(17),new Integer(20),new Integer(23),new Integer(24) },new Integer[] { new Integer(1),new Integer(1),new Integer(2),new Integer(1),new Integer(3),new Integer(3),new Integer(1),new Integer(2),new Integer(1),new Integer(1),new Integer(1),new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_96 ()
  {
      
      testName = "test_96" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(6),new Integer(11),new Integer(12),new Integer(18),new Integer(20),new Integer(27),new Integer(31),new Integer(34) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(3),new Integer(1),new Integer(1),new Integer(1),new Integer(1) },new Integer[] { new Integer(4),new Integer(7),new Integer(13),new Integer(15),new Integer(21),new Integer(23),new Integer(26),new Integer(30) },new Integer[] { new Integer(1),new Integer(2),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1) },new Integer[] { new Integer(4),new Integer(6),new Integer(7),new Integer(11),new Integer(12),new Integer(13),new Integer(15),new Integer(18),new Integer(20),new Integer(21),new Integer(23),new Integer(26),new Integer(27),new Integer(30),new Integer(31),new Integer(34) },new Integer[] { new Integer(1),new Integer(1),new Integer(2),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(3),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1) }) ;
      return ok_sofar ;
  }


  private static boolean test_97 ()
  {
      
      testName = "test_97" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterLab4.checkMergemultisets(new Integer[] { new Integer(2),new Integer(15),new Integer(19),new Integer(21),new Integer(30),new Integer(31),new Integer(37) },new Integer[] { new Integer(1),new Integer(2),new Integer(2),new Integer(1),new Integer(1),new Integer(1),new Integer(1) },new Integer[] { new Integer(1),new Integer(2),new Integer(5),new Integer(7),new Integer(8),new Integer(21),new Integer(24),new Integer(26),new Integer(30),new Integer(35) },new Integer[] { new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(1),new Integer(2) },new Integer[] { new Integer(1),new Integer(2),new Integer(5),new Integer(7),new Integer(8),new Integer(15),new Integer(19),new Integer(21),new Integer(24),new Integer(26),new Integer(30),new Integer(31),new Integer(35),new Integer(37) },new Integer[] { new Integer(1),new Integer(2),new Integer(1),new Integer(1),new Integer(1),new Integer(2),new Integer(2),new Integer(2),new Integer(1),new Integer(1),new Integer(2),new Integer(1),new Integer(2),new Integer(1) }) ;
      return ok_sofar ;
  }



  static int test_type_to_index(String test_type) {
      if (test_type.equals("power")) return 0;
      if (test_type.equals("peaksearch")) return 1;
      if (test_type.equals("mergemultisets")) return 2;
      throw new RuntimeException();
  }

  static int general_test_to_index(String test_type) {
      if (test_type.equals("rec_power")) return 0;
      if (test_type.equals("rec_peak")) return 1;
      if (test_type.equals("rec_merge_lists")) return 2;
      throw new RuntimeException();
  }

  static boolean results_ok_sofar(boolean[] ok_sofar, String test_type) {
      return true;
  }

  static boolean local_results_ok_sofar(boolean[] results_sofar, String test_type) {
      int index = test_type_to_index(test_type);
      return results_sofar[index];
  }

  static boolean[] combine_general_result(String name, boolean result, boolean general_results[]) {
      int index = general_test_to_index(name);
      general_results[index] = result;
      return general_results;
  }

  static boolean[] combine_results(boolean result, boolean results_sofar[], String id, String test_type) {
      int index = test_type_to_index(test_type);
      results_sofar[index] = results_sofar[index] && result;
      return results_sofar;
  }

  static boolean results_ok(boolean results_sofar[], boolean general_results[]) {
      int successes = 0;
      for (int i=0; i<3; i++) {
	  if (results_sofar[i])
	      ++successes;
      }
      return successes >= 2;
  }

  static void report_results(String tester, boolean results_sofar[], boolean general_results[]) {
      System.out.println("\n++++++++++++++++++++++++++++++++++++++++++\n");

      for (int i=0; i<=2; i++) {
	  String testName;
	  if (i==0) testName = "power";
	  else if (i==1) testName = "findPeak";
	  else testName = "mergeMultisets";

	  System.out.print("Testing results for "+testName+": ");
	  if (results_sofar[i])
	      System.out.println("succeeded");
	  else
	      System.out.println("failed");

	  if (!general_results[i])
	      printWarning
		  (ExecutionTime.UNRELATED,
		   "no recursive definition found for "+testName+"; "+
		   "there is a risk that your solution will receive "+
		   "the grade 0.\n");
      }

      System.out.println("\n------------------------------------------");
      if (results_ok(results_sofar,general_results))
	  System.out.println("\n"+tester+": Test finalizado correctamente.");
      else
	  System.out.println("\n"+tester+": errores detectados.\n");
  }

  static boolean checkPower(int n, int b, int expected) {
      String callString = "RecursiveMethods.power("+n+","+b+")";

      if (hasAttributes()) return false;

      try {
	  int result = RecursiveMethods.power(n,b);
	  if (result != expected) {
	      printError
		  (ExecutionTime.UNRELATED,
		   callString+" should have returned "+
		   "the value "+expected+" but returned "+result);
	      return false;
	  }
      } catch ( Throwable exc ) {
	  printCallException(callString,exc);
	  return false;
      }

      return true;
  }

  static boolean checkPeakSearch(Integer[] iarr, Integer[] peaks) {
      boolean ok_sofar = true;

      String callString = 
	  "RecursiveMethods.findPeak("+printArray(iarr)+")";

      int result;

      MyInteger[] arr = MyInteger.array(iarr);
      
      if (hasAttributes()) return false;

      try {
	  MyInteger.setCounter(0);
	  result = RecursiveMethods.findPeak(arr);
      } catch ( Throwable exc ) {
	  printCallException(callString,exc);
	  return false;
      }


      if (ok_sofar) {
	  long counter = MyInteger.getCounter();

	  boolean found = false;
	  for (Integer peak : peaks) {
	      if (peak == result) found = true;
	  }
	  
	  if (!found) {
	      printError
		  (ExecutionTime.UNRELATED,
		   "the call "+callString+
		   " returns "+result+
		   " but should have returned one of the peak indices "+
		   printArray(peaks));
	      return false;
	  }

	  if (counter > 0) {
	      int targetCounter = (int)(Math.log(iarr.length)/Math.log(2))*2+1;
	      if (counter > targetCounter) {
		  printError
		      (ExecutionTime.UNRELATED,
		       "the call "+callString+
		       " required "+counter+" calls to equals or compareTo"+
		       " but should only have required "+
		       targetCounter+" calls at most");
		  return false;
	      }
	  }
      }

      return ok_sofar;
  }

static boolean checkMergemultisets(Integer[] arr1, Integer[] count1, Integer[] arr2, Integer[] count2, Integer[] expected, Integer[] counte) {
      boolean ok_sofar = true;
      
      String callString = 
	  "RecursiveMethods.mergeMultisets("+toList(arr1,count1)+","+
	  toList(arr2,count2)+")";

      if (hasAttributes()) return false;

      PositionList<Pair<Integer,Integer>> pl1 = toList(arr1,count1);
      PositionList<Pair<Integer,Integer>> pl2 = toList(arr2,count2);
      PositionList<Pair<Integer,Integer>> expectedl = toList(expected,counte);
      PositionList<Pair<Integer,Integer>> resl = null;

      try {
	  resl = RecursiveMethods.mergeMultisets(pl1,pl2);
      } catch ( Throwable exc ) {
	  printCallException(callString,exc);
	  return false;
      }

      if (ok_sofar) {
	  if (resl == null) {
	      printError
		  (ExecutionTime.UNRELATED,
		   "the call "+callString+
		   " returns the null reference");
	      return false;
	  }
	  
	  if (resl == pl1) {
	      printError
		  (ExecutionTime.UNRELATED,
		   "the call "+callString+
		   " should have returned a new object"+
		   " but returned the first argument");
	      return false;
	  }

	  if (resl == pl2) {
	      printError
		  (ExecutionTime.UNRELATED,
		   "the call "+callString+
		   " should have returned a new object"+
		   " but returned the second argument");
	      return false;
	  }

	  if (!checkListEq(resl,expectedl)) {
	      printError
		  (ExecutionTime.UNRELATED,
		   "the call "+callString+
		   " returns the multiset "+resl+
		   " but should have returned the multiset "+expectedl);
	      return false;
	  }
      }

      if (ok_sofar) {
	  if (!checkListEq(pl1,toList(arr1,count1))) {
	      printError
		  (ExecutionTime.UNRELATED,
		   "the call "+callString+
		   " modified the first multiset argument "+toList(arr1,count1)+
		   " which is now "+pl1);
	      return false;
	  }
      }
      
      if (ok_sofar) {
	  if (!checkListEq(pl2,toList(arr2,count2))) {
	      printError
		  (ExecutionTime.UNRELATED,
		   "the call "+callString+
		   " modified the second multiset argument "+toList(arr2,count2)+
		   " which is now "+pl2);
	      return false;
	  }
      }

      return ok_sofar;
  }

    static void printCallException(ExecutionTime time, String msg, Throwable exc) {
      System.out.println("\n*** Error for "+testName+": ");

      if (!callSeq.equals("")) {
	  System.out.print(callSeqString(time));
	  System.out.println(callSeq);
      }

      switch (time) {
      case AFTER:
	  System.out.println("the call to "+msg+" raised the exception "+exc+
			     " although it should not have\n");
	  break;
      default:
	  System.out.println("the exception "+exc+" was raised although it "+
			     "should not have been\n");
	  break;
      }
      exc.printStackTrace();
    }

  static void printCallException(String msg, Throwable exc) {
      printCallException(ExecutionTime.AFTER,msg,exc);
  }

  static void printCallException(Throwable exc) {
      printCallException(ExecutionTime.LAST,"",exc);
  }

  static void printWarning(ExecutionTime time, String msg) {
      System.out.println("\n*** Warning for "+testName+": ");
      System.out.print(callSeqString(time));
      System.out.println(callSeq);
      System.out.println(msg+"\n");
  }

    static void printError(ExecutionTime time, String msg) {
      System.out.println("\n*** Error for "+testName+": ");
      System.out.print(callSeqString(time));
      System.out.println(callSeq);
      System.out.println(msg+"\n");
  }

  static String callSeqString(ExecutionTime time) {
      switch(time) {
      case AFTER:
	  return "after executing the call sequence ";
      case LAST:
	  return "while executing the last statement of call sequence ";
      case DURING:
	  return "while executing the call sequence ";
      case UNRELATED:
	  return "";
      }
      return "";
  }

static <E> PositionList<Pair<E,Integer>> toList(E[] arr, Integer[] count) {
    PositionList<Pair<E,Integer>> l = new NodePositionList<Pair<E,Integer>>();
      for (int i=0; i<arr.length; i++)
	  l.addLast(new Pair<E,Integer>(arr[i],count[i]));

      return l;
  }

  static <E> boolean checkListEq(PositionList<E> l1, PositionList<E> l2) {
      Object[] arr1 = l1.toArray();
      Object[] arr2 = l2.toArray();
      
      if (arr1.length != arr2.length) return false;
      else {
	  for (int i=0; i<arr1.length; i++) {
	      if (arr1[i]==null) return arr2[i]==null;
	      else if (!arr1[i].equals(arr2[i])) 
		  return false;
	  }
      }
      return true;
  }

  static String printArray(Object[] arr) {
      StringBuilder arrString = new StringBuilder("[");
      
      for (int i = 0; i < arr.length; i++) {
	  arrString.append(arr[i].toString());
	  if (i < arr.length-1)
	      arrString.append(" ");
      }
      arrString.append("]");
      return arrString.toString();
  }


  static boolean checkRecursive(String starter) {
      ClassParser cp = null;
      JavaClass jc = null;

        ClassLoader loader = 
	    TesterLab4.class.getClassLoader();
	String classLocation = 
	    loader.getResource("aed/recursion/RecursiveMethods.class").getFile();

	try {
	    cp = new ClassParser(classLocation);
	} catch (Exception exc) {
	    System.out.println
		("\nnot checking recursion: cannot read RecursiveMethods classfile");
	    exc.printStackTrace();
	    return false;
	}

	try {
	    jc = cp.parse();
	} catch (Exception exc) {
	    System.out.println
		("\nnot checking recursion: cannot parse classfile RecursiveMethods");
	    exc.printStackTrace();
	    return false;
	}

	Map<String,Set<String>> calls = new Hashtable<String,Set<String>>();
	ClassCFG ccfg = new ClassCFG(jc, calls);
	ccfg.start();
	boolean result = isRecursive(starter,new TreeSet<String>(),calls);

	if (!result)
	    System.out.println
		("\nWARNING: La implementacion de "+starter+
		 " no parece recursivo aunque es OBLIGATORIO "+
		 "-- compruebalo manualmente!\n");
	return result;
  }

    static boolean hasAttributes() {
	Class<RecursiveMethods> cl = RecursiveMethods.class;
	boolean hasAttributes = false;
	
	for (Field field : cl.getFields()) {
	    if (!hasAttributes) {
		printError
		    (ExecutionTime.UNRELATED,
		     "the class RecursiveMethods contains the field "+
		     field.getName()+"; this is not permitted");
		hasAttributes = true;
	    }
	}

	return hasAttributes;
    }

    static boolean isRecursive(String current, 
			       Set<String> seen,
			       Map<String,Set<String>> calls) {
	if (seen.contains(current)) {
	    return true;
	}

	Set<String> nexts = calls.get(current);
	seen.add(current);

	if (nexts == null) return false;
	else {
	    for (String next : nexts)
	    if (isRecursive(next,seen,calls)) return true;
	}

	return false;
    }
}
