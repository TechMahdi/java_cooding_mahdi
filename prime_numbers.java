//prime number /////////

package javaapplication3;

import java.util.Scanner;


public class NewClass {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        int n;
        int count=0;
        n= input .nextInt();
        for(int i=2;i<n;i++)
        {
            if(n%2==0)
            {
                count++;
                break ;
            }
           
        }
        if(count==0)
        {
           System.out.println("prime number"); 
        }
        else
        {
            System.out.println("not prime number"); 
        }
        
    }
    
}
