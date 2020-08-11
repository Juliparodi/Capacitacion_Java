package com.capacitacionjava.ejercicioc.model;

public class Circulo {
    private Punto origen;
    private double radio;
    private static final double pi  = 3.14;

    public Circulo(Punto origen, double radio) {
        this.origen = origen;
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    public boolean equals(Circulo c){
        return (this.origen==c.origen && this.radio==c.radio);
    }

    public String toString(){
        return "punto: " + origen.getX() + " " + origen.getY() + " radio: " + radio;
    }

    public double CalculatePerimeter(){
        return (Math.pow(pi, 2)) * radio;

    }

    public double CalculateArea(){
        return pi * (Math.pow(radio, 2));

    }

    public double CalculateDistance(Circulo c) {
        return Math.sqrt((this.origen.getX() - c.origen.getX()) * (this.origen.getX() - c.origen.getX()) + ((this.origen.getY() - c.origen.getY()) * (this.origen.getY() - c.origen.getY())));
    }
}

