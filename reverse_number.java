                            
package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        int n=input .nextInt();
        int temp=n;
        int rem=0;
        int last=0;
           while(temp!=0)
           {
               
                rem=temp%10;
                last=last*10+rem;
                temp/=10;
               
           }
           System.out.println(last);
     
    }
    

}
