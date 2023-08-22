
package javaapplication4;

import java.util.Scanner;


public class NewMain {

    
    public static void main(String[] args) {
            Scanner input =new Scanner(System.in);
            int [][]arr =new int[2][3];
            int [][] arr1 =new int [2][3];
            System.out.println("A MATRIX :: ");
            
            for(int i=0;i<2;i++)
            {
                for(int j=0;j<3;j++)
                {
                    
                    arr[i][j]=input.nextInt();
                }
                
            }
            System.out.println("\n\n");
            System.out.println("printing  A MATRIX ");
               for(int i=0;i<2;i++)
            {
                for(int j=0;j<3;j++)
                {
                    
                    System.out.print("\t "+arr[i][j]);
                }
                System.out.println(" ");
            }
               System.out.println("\n\n");
               System.out.println("B MATRIX");
               for(int i=0;i<2;i++)
            {
                for(int j=0;j<3;j++)
                {
                    
                    arr1[i][j]=input.nextInt();
                }
                System.out.println(" ");
            }
               System.out.println("\n\n");
         
              System.out.println("PRINTING  B MATRIX :: ");
             for(int i=0;i<2;i++)
            {
                for(int j=0;j<3;j++)
                {
                    
                    System.out.print("\t"+arr1[i][j]);
                }
                System.out.println(" ");
                
            }
             System.out.println("\n\n");
                  System.out.println("A+B = ");
              for(int i=0;i<2;i++)
            {
                for(int j=0;j<3;j++)
                {
                    
                    System.out.print("\t "+(arr[i][j]+arr1[i][j]));
                }
                System.out.println(" ");
            }
             
    }
    
}
