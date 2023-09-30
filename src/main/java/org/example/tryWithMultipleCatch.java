package org.example;

public class tryWithMultipleCatch
{

    public static void main(String[] args) {
//        try{
//            System.out.println(10/0);
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
////        catch(ArithmeticException ae){
////            ae.printStackTrace();
////        }
////      in above example we are having compile time error as the arithmetic exception is
////      already been caught; so the hierarchy should be from child to parent not parent to child
//
//        try{
//            System.out.println(10/0);
//        }
//        catch(ArithmeticException ae){
//            ae.printStackTrace();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//
//
//        try {
//            System.out.println("try");
//            System.exit(0);
//        }
//
////      if JVM itself is down(System.exit(0)) we can not be able to execute finally block
//        catch(Exception e){
//            System.out.println("catch");
//        }
//        finally {
//            System.out.println("finally");
//        }

        try{
            System.out.println("stm1");
            System.out.println("stm2");
        }
        catch(Exception e){
            System.out.println(10/0);
        }
        finally{
            System.out.println("stm5");
        }
        System.out.println("stm6");

    }
}
