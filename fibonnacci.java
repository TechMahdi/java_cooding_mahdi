                            
package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        int n=input .nextInt();
        int first=0;
        int second =1;
        int fibo=0;
        System.out.print(first+" "+second);
        for(int  i=3;i<=n;i++)
        {
            fibo=first+second;
             System.out.print(" "+fibo );
            first=second;
            second=fibo;
        }
            System.out.println();
    }
    

}
//another approach 
                            
package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        int n=input .nextInt();
        int first=0;
        int second =1;
        int fibo=0;
       //System.out.print(first+" "+second);
        for(int  i=1;i<=n;i++)
        {
            System.out.println(first);
           fibo=first+second;
           first=second;
           second=fibo;

        }
       
          // System.out.println(fibo); 
    }
    

}
