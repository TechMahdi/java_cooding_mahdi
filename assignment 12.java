
package javaapplication3;

import java.util.Scanner;




public class JavaApplication3 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n,sum=0;
  
        m = input.nextInt();
        n = input.nextInt();
        for (int i = m; i <=n; i++) {
            if(i%2==0)
            {
                continue;
            }
            else if(m%2==1)
            {
                sum+=i;
            }
            
        }
             
       
        System.out.println("odd:  "+sum);
      
    }
    
}





//sum of even 





package javaapplication3;

import java.util.Scanner;




public class JavaApplication3 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n,sum=0;
  
        m = input.nextInt();
        n = input.nextInt();
        for (int i = m; i <=n; i++) {
            if(i%2==1)
            {
                continue;
            }
            else if(i%2==0)
            {
                sum+=i;
                
                System.out.print(" "+i);
            }
            
        }
             
        System.out.println(" odd: "+sum);
       
      
    }
    
}

