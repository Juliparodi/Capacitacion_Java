package com.capacitacionjava.ejercicioc.model;

public class Circulo {
    private Punto origen;
    private double radio;

    public Circulo(Punto origen, double radio) {
        this.origen = origen;
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //radio will be equal to distance between circle origin and point as parameter
    public void setRadio(Punto punto) {
        this.radio = this.origen.calculateDistance(punto);
    }

    public Punto getOrigen() {
        return origen;
    }

    public double getRadio() {
        return radio;
    }

    //equals para objects
    //== para primitivos (int)
    @Override
    public boolean equals(Object c){
        return this.origen.equals(((Circulo)c).getOrigen()) && this.radio==((Circulo)c).getRadio();
    }

    @Override
    public String toString(){
        return "punto: " + origen.getX() + " " + origen.getY() + " radio: " + radio;
    }

    public double calculatePerimeter(){
        return (Math.pow(Math.PI, 2)) * radio;
    }

    public double calculateArea(){
        return Math.PI * (Math.pow(radio, 2));
    }

    //calling calculateDistance already defined in punto class
    public double calculateDistance(Circulo c) {
        return this.origen.calculateDistance(c.origen);
    }
}

