 1   
 1  0   
 1  0  1 

   here codes starts ..
                               
package javaapplication4;

import static java.lang.Math.pow;
import java.util.Scanner;

public class JavaApplication4 {

    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
            int n ;
             n=input.nextInt();
            int row,col;
            for(row =1;row<=n;row++)
            {
                for(col=1;col<=row;col++)
                    
                {
                    if(col%2==0)
                    {
                        System.out.print(" 0 ");
                        
                    }
                    else if(col%2!=0)
                    {
                        
                        System.out.print(" 1 ");
                    }
                    
                    
                }
                System.out.println("  ");
                
                
            }

    
                
            
         
   }
    

}
