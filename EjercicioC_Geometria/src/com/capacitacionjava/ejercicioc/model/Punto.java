package com.capacitacionjava.ejercicioc.model;

import java.util.Objects;

public class Punto {

    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object p) {
        return ((this.x==((Punto)p).getX())) && ((this.y==((Punto)p).getY()));
    }

    // re-definition
    @Override
    public String toString(){
        return "("+x+","+y+")";
    }

    //(i looked for the formula in google jeje)
    public double calculateDistance(Punto p){
        return Math.sqrt(x-(p.getX())*(x-(p.getX()))) + (y-(p.getY())*(y-(p.getY()))) ;
    }

}
