
package javaapplication5;

import java.util.Scanner;


public class JavaApplication5 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       char ch1,ch2;
       System.out.println("ask the candidate have you completed your masters");
    ch1=input.next().charAt(0);
    System.out.println("are you fluent in english ");
    ch2=input.next().charAt(0);
    if((ch1=='y'&&  ch2=='y') ||(ch1=='Y' && ch2=='Y') )
    {
        System.out.println("you are eligibale for this job \n");
    }
   else
    {
        System.out.println("you are  NOT eligable for this job ");
                
    } 
            
       
     }       
    
}







