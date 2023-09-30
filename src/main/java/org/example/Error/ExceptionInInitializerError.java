package org.example.Error;

/* child class of LinkageError ->Error ->Throwable */
/* while performing static variable initialization and static block execution
   if JVM have any exception then we get ExceptionInInitializerError */
public class ExceptionInInitializerError {
    static {
        String s = null;
        System.out.println(s.length());
    }
    static int x = 10/0;
    public static void main(String[] args) {
        System.out.println(x);
    }
}
