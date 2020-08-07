package com.capacitacionjava.ejercicio1A.model;

public class Patient {
    private String name;
    private String surname;
    private float height;
    private float weight;

    public Patient(String name, String surname, float height, float weight) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getCompleteName() {
        String result = name + " " + surname;
        return result;
    }
}