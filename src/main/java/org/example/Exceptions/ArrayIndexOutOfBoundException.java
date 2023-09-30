package org.example.Exceptions;

/* Child class of IndexOutOfBoundException ->RuntimeException ->Exception ->Throwable */
public class ArrayIndexOutOfBoundException {

    public static void main(String[] args) {
        int[] a = new int[10];
        System.out.println(a[10]);
    }
}
