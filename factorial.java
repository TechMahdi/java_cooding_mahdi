
//bismillah //
package javaapplication5;

import java.util.Scanner;


public class JavaApplication5 {

    
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        int n;
        n= input.nextInt();
        int fact =1;
        for(int i=n; i>=1;i--)
        {
            fact=fact*i;
        }
       System.out.println("fact of num"+n +  "=" +fact);

    }
}



