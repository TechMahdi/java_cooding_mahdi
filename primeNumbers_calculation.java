///total prime number from m to n code ////////

package javaapplication4;

import java.util.Scanner;


public class JavaApplication4 {

    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
            int m,n;
            int count=0;
            int totalprime=0;
            m=input.nextInt();
            n=input.nextInt();
            for(int i=m;i<=n;i++)
            {
                for(int j=2;j<=i-1;j++)
                {
                    if(i%j==0)
                    {
                        
                        count++;
                        break;
                    }
                }
            
                if(count==0 && i>1)
                {
                       System.out.println(i);
                       totalprime++;
                   
                }
                count=0;
            }
            System.out.println("total prime is :  "+totalprime);

    }
    

}
