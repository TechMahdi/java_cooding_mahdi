package javaapplication5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class arraylist {

    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
      String hexadecimal="F";
      Integer decimal =Integer.parseInt(hexadecimal, 16);
        System.out.println("any number system to decimal "+decimal);
        int i=45;
        String binary=Integer.toBinaryString(i);
        System.out.println("decimal number system to binary "+binary);
        
    }
}
