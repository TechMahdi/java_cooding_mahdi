
package javaapplication3;

import java.util.Scanner;




public class JavaApplication3 {

   
    public static void main(String[] args) {
        int x;
        int fact=1;
        Scanner input =new Scanner (System.in);
        x = input.nextInt();
        for (int i = 1; i <=x; i++) {
            fact= fact*i;
            
        }
        System.out.println("fact\n"+fact);
        
      
    }
    
}
