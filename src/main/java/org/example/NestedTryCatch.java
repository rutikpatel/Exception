package org.example;

public class NestedTryCatch {

    public static void main(String[] args) {

        try{
            System.out.println("outer try block");
            try{
                System.out.println("inner try block");
                System.out.println(10/0);
            }
            catch (ArithmeticException ae){
                System.out.println("inner catch block");
            }
            System.out.println("outside of inner ty-catch");
        }catch(Exception e){
            System.out.println("outer catch block");
        }finally {
            System.out.println("outer finally block");
        }
    }
}
