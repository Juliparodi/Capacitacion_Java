package com.capacitacionjava.ejercicio1A.test;

import com.capacitacionjava.ejercicio1A.model.Patient;

public class TestConsultorio {
    public static void main(String[] args) {
        Patient patient1 = new Patient("José", "Pérez",1.80f,85);
        Patient patient2 = new Patient("Jorge", "Fernández",1.60f,90);
        System.out.println("Patients:");
        System.out.println(patient1.getCompleteName());
        System.out.println(patient2.getCompleteName());

    }
}
