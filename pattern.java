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
pattern :02 ::::::
  *
  * *
  * * *
                              
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
                System.out.print("* ");
            }
            System.out.print("\n");
        }
         
    }
    

}
pattern :03
 *  *  *  *  * 
 *  *  *  * 
 *  *  * 
 *  * 

                            
package javaapplication4;

import static java.lang.Math.pow;
import java.util.Scanner;

public class JavaApplication4 {

    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        
        int n;
        int row ,col;
        n=input.nextInt();
        for(row =n;row>=1;--row)
        {
            for(col=1;col<=row;col++)
            {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
         
    }
  pattern :04
*  *  *  *  * 
 *  *  *  *  * 
 *  *  *  *  * 
 *  *  *  *  * 
 *  *  *  *  * 
                                
package javaapplication4;

import static java.lang.Math.pow;
import java.util.Scanner;

public class JavaApplication4 {

    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        
      int n;
      n=input.nextInt();
      for(int i=1;i<=n;i++)
      {
          for(int j=1; j<=n; j++)
          {
              System.out.print(" * ");
              
          }
          System.out.println();
      }
         
    }
    

}

}                            

}
