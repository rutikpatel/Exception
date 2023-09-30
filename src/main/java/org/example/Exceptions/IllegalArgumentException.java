package org.example.Exceptions;

/* child class of RuntimeException ->Exception ->Throwable */
public class IllegalArgumentException {
    public static void main(String[] args) {
        Thread t = new Thread();
        t.setPriority(100);
    }
}
