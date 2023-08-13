
package javaapplication2;

import java.util.Scanner;


public class JavaApplication2 {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x= input.nextInt();
        int y= input.nextInt();
        x+=y;//x=x+y
        System.out.println("x =" +x);
         x-=y;//x=x-y
        System.out.println("x =" +x);
         x*=y;//x=x*y
        System.out.println("x =" +x);
         x/=y;//x=x/y
        System.out.println("x =" +x);
         x%=y;//x=x%y
        System.out.println("x =" +x);
               
             
    }
    
}
