//premitive datat type to object wapper class

package javaapplication5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class arraylist {

    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
         int x=56;
         Integer y=Integer.valueOf(x);
         System.out.println("the x is "+y);
         Integer z= x;//Integer.ValueOf(x)//autoboxing
         System.out.println("the z is"+z);
        
    }
}

>>>object to premititve data type  by wapper classs
package javaapplication5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class arraylist {

    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
     
         Double d= new Double (4654.66);
         System.out.println("the d is "+d);
         double e= d;//d.doubleValue();//unboxing
         System.out.println("the e is "+e);
        
    }
}
