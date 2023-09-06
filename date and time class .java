>>date formatting in java ......
package javaapplication5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class arraylist {

    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
          Date date =new Date();
          System.out.println("the date without format"+date);
          DateFormat dateformat=new SimpleDateFormat("YYYY/MM/dd");
          String currentdate=dateformat.format(date);
          System.out.println("the date is after format "+currentdate); 
    }
}
