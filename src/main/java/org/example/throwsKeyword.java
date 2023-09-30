package org.example;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class throwsKeyword {
    public static void main(String[] args) throws FileNotFoundException {
        /*
         throws - In our program if there is any chance of getting checked exception
                  we can define the exception using throws keyword
         There are two ways to define checked exception
         1) using try and catch block
         */
         try{
             PrintWriter pw = new PrintWriter("hello.txt");
             pw.println("Hello");
         }
         catch(FileNotFoundException e){
             System.out.println(e);
         }

        /*
         2) using throws keyword at caller method
            -> even-though we use this keyword the terminations of the program will be abnormal
               so its is recommendable to use try catch block.
            -> we can only use throws keyword for methods and constructors.
        */

        PrintWriter pw = new PrintWriter("hello.txt");
        pw.println("Hello");



    }
}

