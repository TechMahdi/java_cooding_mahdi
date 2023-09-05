package javaapplication5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class arraylist {

    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
     String name ="mahdi mahdi  is the great person person";
     String nmae1="";
     String m=" my name is  ";
     String n ="aniusl islam chowdhury";
  
        System.out.println("the string is :"+m.trim());
    
      String [] text =n.split(" ");
      for(String x: text)
      {
          System.out.println(" "+x);
      }
    }
}

