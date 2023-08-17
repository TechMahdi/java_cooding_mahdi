
package javaapplication3;

import java.util.Scanner;




public class JavaApplication3 {

   
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
           int     num ;
           int result=0;
           // int  result=1;
           num=input.nextInt();
         for(int i=1;i<=10 ;i++)
         {
           System.out.println(num+"X" +i + "=" +i*num);
         }
           
      
    }
    
}
