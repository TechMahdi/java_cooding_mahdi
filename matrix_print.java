
package javaapplication4;

import java.util.Scanner;


public class NewMain {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int [][]num=new int [2][3];
         System.out.println("enter the elemnst for a matrix ");
        for(int row =0;row<2;row++)
        {
            for(int col=0;col<3;col++)
            {
               
                System.out.printf(" A =[%d][%d] = ",row ,col);
                num[row][col]=input.nextInt();
            }
        }
        System.out.println(" ");
         for(int row =0;row<2;row++)
        {
            for(int col=0;col<3;col++)
            {
                System.out.printf(" A =  [%d][%d] = ",row ,col);
                System.out.println(" "+num[row][col]);
            }
                    }
       
    }
    
}
