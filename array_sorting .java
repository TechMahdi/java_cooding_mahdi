package javaapplication4;

import java.util.Arrays;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        int []num=new int [5];
        for(int i=0;i<num.length;i++)
        {
            num[i]=input.nextInt();
            
        }
        Arrays.sort(num);
        for(int i=0;i<num.length;i++)
        {
            System.out.println("ascending order  "+num[i]);
            System.out.println(" ");
        }
        for(int i=num.length-1;i>=0;i--)
        {
            System.out.println("desending order  "+num[i]);
        }
        String []habibi={"bolbo","anisul","kabu","tabu"};
          Arrays.sort(habibi);
          for(int i=0;i<habibi.length;i++)
          {
              System.out.println("dictonary order "+habibi[i]);
          }
             for(int i=habibi.length-1;i>=0;i--)
          {
              System.out.println(" "+habibi[i]);
          }

    }

}
