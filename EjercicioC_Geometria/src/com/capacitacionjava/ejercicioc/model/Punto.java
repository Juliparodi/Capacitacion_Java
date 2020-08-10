package com.capacitacionjava.ejercicioc.model;

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

    public boolean equals(Punto p){
        return ((x==p.getX())&&(y==p.getY()));
    }
    // re-definition
    @Override
    public String toString(){
        return "("+x+","+y+")";
    }

    public double calculateDistance(Punto p){
        return Math.sqrt((p.getX()-x)*(p.getX()-x) + (p.getY()-y)*(p.getY()-y));
    }


}
