package org.example.Error;

/* child class of  Error ->Throwable */
/* if assert statement will fail we will get assertion error*/
public class AssertionError {
    public static void main(String[] args) {
        int x = 10;
        assert (x>10);
    }


}
