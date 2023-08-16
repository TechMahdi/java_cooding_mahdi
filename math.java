//assignment 8/////
//bismillah //
package javaapplication5;

import java.util.Scanner;


public class JavaApplication5 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        int z;
       z= input.nextInt();
       int x =input.nextInt();
        System.out.println(Math.abs(z));
        System.out.println(Math.random ());
      //  System.out.prin(Math.random ()*101);
  //(int)(Math.random() * 101));
  int randomNum = (int)(Math.random() * 101);
  System.out.println(randomNum);
  
        System.out.println(Math.max(z,x));
        System.out.println(Math.min (z,x));
        System.out.println(Math.sqrt ((double)z));
      
        System.out.println(Math.pow ((double)x,(double)z));
           
       
     }       
    
}







