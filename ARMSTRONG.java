                            
package javaapplication4;

import static java.lang.Math.pow;
import java.util.Scanner;

public class JavaApplication4 {

    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
            int n;
            int sum=0,r=0;
            n=input.nextInt();
            int temp=n;
            while(temp>0)
            {
                 r=temp%10;
                sum=sum + r*r*r;
                temp/=10;
                
                
            }
            if(sum==n)
            {
                System.out.println("ARMSTRONG NUMBER");
            }
            else
            {
                System.out.println("not ARMSTRONG NUMBER");
                
            }
    }
    

}
