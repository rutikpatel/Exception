package org.example.Exceptions;

/* child class of RuntimeException ->Exception ->Throwable */
public class NullPointerException {

    public static void main(String[] args) {
        String s=null;
        System.out.println(s.length());

    }
}
