
package javaapplication2;

import java.util.Scanner;


public class JavaApplication2 {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        radius = input.nextDouble();
     double area = 3.1416 * radius *radius ;
     System.out.print("area \n " +area );
    }
    
}
