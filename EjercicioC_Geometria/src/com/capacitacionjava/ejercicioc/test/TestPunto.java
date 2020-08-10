package com.capacitacionjava.ejercicioc.test;

import com.capacitacionjava.ejercicioc.model.Punto;

public class TestPunto {
    public static void main(String[] args) {

        //STAGE1
        //Object Initialization
        Punto punto1 = new Punto(2, 3);
        Punto punto2 = new Punto(5, 7);

        //print both objects
        System.out.println("Punto 1: x = " + punto1.getX() + " y = " + punto1.getY());
        System.out.println("Punto 2: x = " + punto2.getX() + " y = " + punto2.getY());

        //Calling and printing ToEquals method
        System.out.println("Result of Equals between both points is: " + punto1.equals(punto2));
        System.out.println(punto1.toString());

        //STAGE 2
        System.out.println("Distance between punto 2 and punto 1 is: " + punto1.calculateDistance(punto2));
    }
}
