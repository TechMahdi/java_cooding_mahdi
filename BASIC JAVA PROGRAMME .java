//programme about vowel and consonet check
package javaapplication4;

import java.util.Scanner;


public class JavaApplication4 {

    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
       
      char ch ;
      ch =input.next().charAt(0);
      if(ch=='a')
      {System.out.println("vowel");
      
      }
      else  if(ch=='e')
      {System.out.println("vowel ");
      
      }
      else  if(ch=='i')
      {System.out.println("vowel");
      
      }
      else   if(ch=='o')
      {System.out.println("vowel");
      
      }
        if(ch=='u')
      {System.out.println("vowel");
      
      }
          if(ch=='A')
      {System.out.println("vowel");
      
      }
          else  if(ch=='E')
      {System.out.println("vowel");
      
      }    
          else  if(ch=='I')
      {System.out.println("vowel");
      
      }
              else  if(ch=='O')
      {System.out.println("vowel");
      
      }
              else  if(ch=='U')
      {System.out.println("vowel");
      
      }
          else
              {
                  System.out.println("consonent");
              }
          
          
    }
    
}

// capital and small alphabet 

package javaapplication4;

import java.util.Scanner;


public class JavaApplication4 {

    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
       char ch= input.next().charAt(0);
       if(ch>=65 && ch<=96)
       {
           System.out.println("capital characther is  : "+ch);
       }
       else if(ch>=97 && ch<=122)
       {
           System.out.println("small characther is  : "+ch);
       }
        
          
    }
    
}
//maximum and minimum of three numbers 

package javaapplication4;

import java.util.Scanner;


public class JavaApplication4 {

    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    int a= input.nextInt();
    int b= input.nextInt();
    int c= input.nextInt();
    int max=0;
        if(a>b)
        {
            if(a>c)
            {
                max =a;
               // System.out.println("max is = "+max);
            }
        
        else
        {
            max =c;
          //  System.out.println("max is = "+max);
        }
       }
        else 
        {
                 if(b>c)
                {
                    max=b;
                    
                }
                else
                {
                    max=c;
                   //  System.out.println("max is = "+max);
                }
             }
          System.out.println("max is = "+max);

    }
    

}
//

