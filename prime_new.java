
package javaapplication3;

import java.util.Scanner;


public class NewClass {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        int n;
        int count=0;
        n= input .nextInt();
        if(n==0 ||n==1)
        {
            System.out.println("not a prime ");
        }
        else
        {
            for(int i=2;i<n/2;i++)
            {
                if(n%i==0)
                {
                    count++;
                    break;
                }
            }

            
        
        if(count==0)
        {
            System.out.println("this is a prime");
        }
        else
        {
            System.out.println("not prime");
        }
        }
    }
    
}
