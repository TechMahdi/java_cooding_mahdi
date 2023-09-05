package javaapplication5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class arraylist {

    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        String s="121";
       StringBuffer sb= new StringBuffer(s);
     String text=  sb.reverse().toString();
     if(text.equals(s))
     {
         System.out.println("plaindrome");
     }
     else
     {
         System.out.println("not palindrome");
     }
      
        
    }
}
