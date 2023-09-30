package org.example;

public class ExceptionHandling {

    public static void main(String[] args) {
        System.out.println("st-1");
        try {
            System.out.println(10 / 0);
        }
        catch(ArithmeticException ae){
            System.out.println(10 / 2);
        }
        System.out.println("st-3");
    }
}
