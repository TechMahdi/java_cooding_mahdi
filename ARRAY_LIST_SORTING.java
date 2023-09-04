
package javaapplication5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class arraylist {
  public static void main (String []args)
  {
      Scanner input =new Scanner(System.in);
      ArrayList<Integer>num =new ArrayList<Integer>();
      num.add(-45);
      num.add(-454);
      num.add(-1);
      num.add(-4);
      num.add(-5);
      num.add(-5657);
      num.add(-67);
      num.add(-58);
         Collections.sort(num,Collections.reverseOrder());
      System.out.println(" "+num);
      Collections.sort(num);
      System.out.println(" "+num);
   
    }
}
