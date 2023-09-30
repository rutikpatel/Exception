package org.example;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class checkedException {

    public static void main(String[] args)
            throws FileNotFoundException, InterruptedException
    //if we remove this throws we will be having compile time error at line #11 and #16.
    {
        PrintWriter pw= new PrintWriter("abc.txt");
        pw.println("Hello");

        System.out.println("Hello");
        Thread.sleep(1000);
    }


}
