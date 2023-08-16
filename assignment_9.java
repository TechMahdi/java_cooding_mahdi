//assignment 8/////
//bismillah //
package javaapplication5;

import java.util.Scanner;


public class JavaApplication5 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
      int option;
      option =input.nextInt();
      switch(option)
      {
          case 1 :
              System.out.println("set language bangla");
              break;
          case 2 :
              System.out.println("set language hindhi");
              break;
          case 3 :
              System.out.println("set language urdhu");
              break;
          
          default:
              System.out.println("english");
          
          
          
      }
           
            
            
        
            
       
     }       
    
}







