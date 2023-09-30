package org.example;


class vehicle{
    String type;
    int maxSpeed;
    vehicle(String type, int maxSpeed){
        this.type =type;
        this.maxSpeed=maxSpeed;
    }

}

class car extends vehicle{

    String trans;
//    car(String trans){
//        if we use this constructor here we'll get compile time exception as we did not
//        provide any super() or this() so JVM automatically put super() and we need to have
//        no argument constructor in parent class to use super()
//        this.trans=trans;
//    }


    car(String type, int maxSpeed, String trans) {
        super(type, maxSpeed);

//        this(trans);
//        we either can use super or this
//        we can not use both at the same time
        this.trans = trans;
    }

}

public class vehicleExample {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}