package javaapplication5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class arraylist {

    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        String s1="anisul";
    StringBuffer sb= new StringBuffer (s1);
    sb.reverse();
        System.out.println("the final guy is"+sb);
        sb.append(34354);
        sb.append("SJDFSHFBHDS");
        sb.append(56.78);
        sb.append(4f);
        sb.append('c');
        System.out.println("khulud binthe harun"+sb);
        sb.delete(0, 5);
        System.out.println("the bah is "+sb);
        
    }
}
