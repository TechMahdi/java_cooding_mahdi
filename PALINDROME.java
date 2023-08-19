                            
package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        int n=input .nextInt();
        int last = 0,rem;
        int temp=n;
        
      
       
           while(temp!=0)
           {
               
                rem=temp%10;
                last=last*10+rem;
                temp/=10;
               
           }
           if(n==last)
           {
               System.out.println("palindrome number");
           }
           else
           {
               System.out.println(" not palindrome number");
           }
     
    }
    

}
