package org.example.Exceptions;

import java.util.ArrayList;
import java.util.Iterator;

/* child class of RuntimeException ->Exception ->Throwable */
public class IllegalStateException {
    public static void main(String[] args) {

        Thread t =new Thread();
        t.start();
//        t.start();


        ArrayList<String> al = new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");

        Iterator<String> itr = al.iterator();

        while (itr.hasNext()){
//            Object obj = itr.next();
            itr.remove();
        }
        System.out.println(al);

    }
}
