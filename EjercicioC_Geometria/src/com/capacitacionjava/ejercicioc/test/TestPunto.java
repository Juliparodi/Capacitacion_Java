package com.capacitacionjava.ejercicioc.test;

import com.capacitacionjava.ejercicioc.model.Circulo;
import com.capacitacionjava.ejercicioc.model.Punto;

public class TestPunto {
    public static void main(String[] args) {

        //STAGE1
        //Object Initialization
        Punto punto1 = new Punto(2, 3);
        Punto punto2 = new Punto(5, 7);
        Circulo circulo1 = new Circulo(punto1, 10);
        Circulo circulo2 = new Circulo(punto2, 7);

        //print Punto objects
        System.out.println("Punto 1: x = " + punto1.getX() + " y = " + punto1.getY());
        System.out.println("Punto 2: x = " + punto2.getX() + " y = " + punto2.getY());

        //Calling and printing Equals and ToString methods method
        System.out.println("Result of Equals between both points is: " + punto1.equals(punto2));
        System.out.println("Result of Equals between both circules is: " + circulo1.equals(circulo2));
        System.out.println(punto1.toString());
        System.out.println(punto2.toString());
        System.out.println(circulo1.toString());
        System.out.println(circulo2.toString());

        //STAGE 2
        System.out.println("Distance between punto 2 and punto 1 is: " + punto1.calculateDistance(punto2));
        System.out.println("Distance between circulo 1 and circulo 2 is: " + circulo1.CalculateDistance(circulo2));

        //test methods created in exercise D
        System.out.println("Area of circulo 1 is: " + circulo1.calculateArea());
        System.out.println("Area of circulo 2 is: " + circulo2.calculateArea());
        System.out.println("Permiter of circulo 1 is: " + circulo1.calculatePerimeter());
        System.out.println("Permiter of circulo 2 is: " + circulo1.calculatePerimeter());



    }
}
