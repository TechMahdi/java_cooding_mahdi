
package javaapplication3;

import java.util.Scanner;




public class JavaApplication3 {

   
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int id =input.nextInt();
        int price =input.nextInt();
      input.next();
        String title=input.nextLine();        
        String description =input.nextLine();
        String catagory= input.nextLine();
        System.out.println("id = " + id );
        System.out.println("price = " + price );
        System.out.println("title = " + title );
        System.out.println("description = " + description  );
        System.out.println("catagory = " + catagory   );
        
    }
    
}
