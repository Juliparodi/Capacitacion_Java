package com.capacitacionjava.ejercicioE.test;

import com.capacitacionjava.ejercicioE.model.ArrayStream;
import com.capacitacionjava.ejercicioE.model.ArrayTraditional;
import com.capacitacionjava.ejercicioE.model.ArrayUnidimensional;

import java.util.concurrent.ThreadLocalRandom;

public class TestArrayUnidimensional {
    public static void main(String[] args) {

        //Object initialization with array's size as parameter
        ArrayUnidimensional array = new ArrayUnidimensional(10);
        ArrayStream arrayUsingStream = new ArrayStream(10);
        ArrayTraditional arrayTraditional = new ArrayTraditional(10);

        //fill array with numbers between 1 and 10
        array.fillArray();

        //print initial array
        System.out.println("Initial array ");
        for (int i = 0; i < arrayUsingStream.sortArrayDesc().length; i++) {
            System.out.print(" " + arrayUsingStream.printArray()[i] + " ");
        }
        System.out.println();

        //TESTS USING STREAM CLASS
        //Traer el menor
        System.out.println("Min number using stream is: " + arrayUsingStream.getMin());

        //Traer el mayor
        System.out.println("Max number using stream is: " + arrayUsingStream.getMax());

        //Calcular Promedio
         System.out.println("Average using stream is: " + arrayUsingStream.average());

        //Ordenar Ascendente
        System.out.println("Array in ascending order using stream: ");
        for (int i = 0; i < arrayUsingStream.sortArrayDesc().length; i++) {
            System.out.print(" " + arrayUsingStream.sortArrayAsc()[i] + " ");
        }
        System.out.println();

        //Ordenar Descendente
        System.out.println("Array in descending orden using stream: ");
        for (int i = 0; i < arrayUsingStream.sortArrayDesc().length; i++) {
            System.out.print(" " + arrayUsingStream.sortArrayDesc()[i] + " ");
        }
        System.out.println();

        //Traerfrecuencia
        int num1 = ThreadLocalRandom.current().nextInt(1,10);
        System.out.println("frequency of number " + num1 + " is: " + arrayUsingStream.traerFrecuencia(num1));

        //Traer moda.
        System.out.println("mode number is: " + arrayUsingStream.traerModa());
        System.out.println();

        //TESTS USING TRADITIONAL METHODS
        System.out.println("Now we are gonna use traditional methods");

        //Traer el minimo
        System.out.println("Min number is: " + arrayTraditional.getMin());

        //Traer el maximo
        System.out.println("Max number is: " + arrayTraditional.getMax());

        //Promedio
        System.out.println("Average is: " + arrayTraditional.avg());

        //Ordenarlo ascendentemente
        System.out.println("Array sorted asc: ");
        arrayTraditional.sortArrayAsc();
        System.out.println();

        //Ordenarlo descendentemente
        System.out.println("Array sorted desc: ");
        arrayTraditional.sortArrayDesc();
        System.out.println();

        //Traerfrecuencia
        System.out.println("frequency of number " + num1 + " is: " + arrayTraditional.traerFrecuencia(num1));

        //Numero de moda
        System.out.println("Mode number is: " + arrayTraditional.traerModa());

    }
}
