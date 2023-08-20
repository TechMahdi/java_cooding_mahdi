>> pattern :01 
1
1 2
1 2 3 
//here code starts ....bhai
                            
package javaapplication4;

import static java.lang.Math.pow;
import java.util.Scanner;

public class JavaApplication4 {

    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        
        int n;
        int row ,col;
        n=input.nextInt();
        for(row =1;row<=n;row++)
        {
            for(col=1;col<=row;col++)
            {
                System.out.print(col+" ");
            }
            System.out.print("\n");
        }
         
    }
    

}
