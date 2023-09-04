
package javaapplication5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class arraylist {
  public static void main (String []args)
  {
      Scanner input =new Scanner(System.in);
      ArrayList<Integer>num1=new ArrayList<Integer>();
      ArrayList<Integer>num2=new ArrayList<Integer>();
      ArrayList<Integer>num3=new ArrayList<Integer>();
      num1.add(1);
      num1.add(2);
      num1.add(3);
      System.out.println(" "+num1);
      num2.add(4);
      num2.add(5);
      num2.add(6);
      System.out.println(" "+num2);
   num3.addAll(num1);
      System.out.println(" "+num3);
   boolean b= num1.equals(num3);
      System.out.println(" "+b);
      
    }
}
