package org.example.Exceptions;

/* child class of RuntimeException ->Exception ->Throwable */
public class ClassCastException {
    public static void main(String[] args) {
        String s = new String("Rutik");
        Object o = (Object) s;

        Object o1 = new Object();
        String s1 = (String) o1;

        Object o2 = new String("Rutik");
        String s2 = (String)o2;

    }
}
