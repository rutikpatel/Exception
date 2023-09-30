package org.example;

public class throwKeyword{

    static ArithmeticException ae = new ArithmeticException();
    static ArithmeticException e ;
    public static void main(String[] args) {

        //throw - used for giving JVM the manually created exception

        // case 1
        // throw ae; here we get ae exception
        // throw e; here we will get null pointer exception as e is null

        // case 2
        System.out.println(10/0);
        System.out.println("Hello");


        // throw new ArithmeticException("/ zero");
        // we can not have any statement after throw keyword been used
        // as we get compile time error and the stmt will become unreachable
        // System.out.println("Hello");

        // case 3
        // throw new throwKeyword();
        // we only use throw for Throwable types
    }
}
