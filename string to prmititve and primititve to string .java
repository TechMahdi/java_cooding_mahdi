>>primititive to string 
package javaapplication5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class arraylist {

    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        int i=67;
        String s =Integer.toString(i);
        System.out.println("the s is "+s);
    }
}
>>>string to primitive
package javaapplication5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class arraylist {

    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
      String s="32";
        System.out.println("the string is "+s);
   
      double i = Double.parseDouble(s);
       
        System.out.println("the i is "+i);
    }
}

