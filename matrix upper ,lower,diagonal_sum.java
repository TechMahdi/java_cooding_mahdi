package javaapplication4;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int sum2=0;
        int sum=0;
        int upper=0;
        int lower=0;
        System.out.println(" A MATRIX");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = input.nextInt();
            }
        }
     
        System.out.println(" diagonal elements addition");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    sum+=arr[i][j];
                }
                if(i>j)
                {
                    lower+=arr[i][j];
                }
                if(i<j)
                {
                    upper+=arr[i][j];
                }
                if(i+j==arr.length-1)
                {
                    sum2+=arr[i][j];
                }
            }

        }
        System.out.println(sum);
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(sum2);
        System.out.println(arr.length);

    }

}
