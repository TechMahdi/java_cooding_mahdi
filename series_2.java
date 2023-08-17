>>>>.......... //1.5*2.5*3.5*.....*N...........<<<<<<<<

package javaapplication3;

import java.util.Scanner;




public class JavaApplication3 {

   
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
           double    n;
            double result=1;
           n=input.nextDouble();
           
           for (double    i =1.5; i <=n; i+=1) {
               result*=i;
            //   System.out.println(" is  "+i);
            
        }
        System.out.println("result   is "+result);
      
    }
    
}
>>> ...........   //1^2* 2^2* 3^3 * 4^2*......*n^2...........<<<<<<<<<<<<

package javaapplication3;

import java.util.Scanner;




public class JavaApplication3 {

   
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
           int     n;
            int  result=1;
           n=input.nextInt();
           
           for (int    i =1; i <=n; i+=1) {
               result*=i*i;
            //   System.out.println(" is  "+i);
            
        }
        System.out.println("result   is "+result);
      
    }
    
}
