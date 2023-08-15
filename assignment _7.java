
package javaapplication5;

import java.util.Scanner;


public class JavaApplication5 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       char ch;
       ch= input.next().charAt(0);
       System.out.println("do you love java !!!");
       
       if (ch=='N'||ch=='n')
       {
         
            System.out.println("you are not a java  lover ");
        
    }
       else if(ch=='Y'|| ch=='y')
       {
           System.out.println("you are a java lover");
       }
    
}
}
