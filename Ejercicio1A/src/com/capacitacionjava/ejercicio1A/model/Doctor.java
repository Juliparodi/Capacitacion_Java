package com.capacitacionjava.ejercicio1A.model;

public class Doctor {
    private String name;
    private String surname;
    private String specialty;

    public Doctor(String name, String surname, String specialty) {
        this.name = name;
        this.surname = surname;
        this.specialty = specialty;
    }

    public Doctor() {
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

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public float calculateIMC(Patient patient){
        float height = patient.getHeight();
        float weight = patient.getWeight();
        float IMC = (float) (weight/(Math.pow(height, 2)));
        return IMC;
    }

    public String getCompleteName() {
        String result = name + " " + surname;
        return result;
    }
}
