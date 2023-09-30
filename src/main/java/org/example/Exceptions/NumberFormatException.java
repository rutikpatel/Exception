package org.example.Exceptions;

/* child class of IllegalArgumentException-> RuntimeException-> Exception-> Throwable */
public class NumberFormatException {

    public static void main(String[] args) {
        int i = Integer.parseInt("10");
        int j = Integer.parseInt("ten");
    }
}
