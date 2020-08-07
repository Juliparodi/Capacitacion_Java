package com.capacitacionjava.ejercicio1A.test;

import com.capacitacionjava.ejercicio1A.model.Doctor;
import com.capacitacionjava.ejercicio1A.model.Patient;

public class TestConsultorio {
    public static void main(String[] args) {
        //Object initialization
        Patient patient1 = new Patient("José", "Pérez",1.80f,85);
        Patient patient2 = new Patient("Jorge", "Fernández",1.60f,90);
        Doctor doctor = new Doctor("Daniel", "Lopez", "sportsman");

       //print results
        System.out.println("Visit 1" + "\n");
        System.out.println("Doctor: " + doctor.getCompleteName());
        System.out.println("Patient " + patient1.getCompleteName() + ": " + "IMC: " + doctor.calculateIMC(patient1));
        System.out.println("Patient " + patient2.getCompleteName() + ": " + "IMC: " + doctor.calculateIMC(patient2) + "\n");

        //calling TestConsultorio2 to change weight
        TestConsultorio2.changeWeight(patient1);
        TestConsultorio2.changeWeight(patient2);

        //printing new values
        System.out.println("Visit 2" + "\n");
        System.out.println("Doctor: " + doctor.getCompleteName());
        System.out.println("Patient " + patient1.getCompleteName() + ": " + "IMC: " + doctor.calculateIMC(patient1));
        System.out.println("Patient " + patient2.getCompleteName() + ": " + "IMC: " + doctor.calculateIMC(patient2));

    }
}
