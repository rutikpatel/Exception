package org.example.Error;

/* Child class of VirtualMachineError-> Error-> Throwable*/
/* When we're performing recursive method call, for every method one entry will be stored
   in stack while method calls will never be ending */
public class StackOverFlowError {

    public static void m1(){
        m2();
    }
    public static void m2(){
        m1();
    }
    public static void main(String[] args) {
        m1();
    }
}

