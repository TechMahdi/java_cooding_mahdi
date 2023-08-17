//1+2+3+4+5+6...+n
package javaapplication3;

import java.util.Scanner;




public class JavaApplication3 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           int n,sum=0;
           n=input.nextInt();
           
           for (int i = 1; i <=n; i++) {
               sum+=i;
            //   System.out.println(" is  "+i);
            
        }
        System.out.println("sum  is "+sum);
      
    }
    
}
//1+3+5+.....+n

package javaapplication3;

import java.util.Scanner;




public class JavaApplication3 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           int n,sum=0;
           n=input.nextInt();
           
           for (int i = 1; i <=n; i+=2) {
               sum+=i;
            //   System.out.println(" is  "+i);
            
        }
        System.out.println("sum  is "+sum);
      
    }
    
}
///1.5+2.5+3.5+....+n


package javaapplication3;

import java.util.Scanner;




public class JavaApplication3 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           double  n,sum=0;
           n=input.nextDouble();
           
           for (double  i = 1.5; i <=n; i+=1) {
               sum+=i;
            //   System.out.println(" is  "+i);
            
        }
        System.out.println("sum  is "+sum);
      
    }
    
}
//1*2*3*4*5*.......*n

package javaapplication3;

import java.util.Scanner;




public class JavaApplication3 {

   
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
           int   n;
            int result=1;
           n=input.nextInt();
           
           for (int   i = 1; i <=n; i++) {
               result*=i;
            //   System.out.println(" is  "+i);
            
        }
        System.out.println("sum  is "+result);
      
    }
    
}


