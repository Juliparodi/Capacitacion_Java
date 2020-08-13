package com.capacitacionjava.ejercicioE.test;

import com.capacitacionjava.ejercicioE.model.ArrayStream;
import com.capacitacionjava.ejercicioE.model.ArrayTraditional;
import com.capacitacionjava.ejercicioE.model.ArrayUnidimensional;

public class TestArrayUnidimensional {
    public static void main(String[] args) {

        //Inicializacion objetos a usar y configuracion del size del Array
        ArrayUnidimensional array = new ArrayUnidimensional();
        ArrayStream arrayUsingStream = new ArrayStream();
        ArrayTraditional arrayTraditional = new ArrayTraditional();

        //Llenar Array con Random numbers entre 1 y 50
        //array.fillArray();

        //print original array
        System.out.println("a ver como esta el array ");
        for (int i = 0; i < arrayUsingStream.sortArrayDesc().length; i++) {
            System.out.print(" " + arrayUsingStream.printArray()[i] + " ");
        }
        System.out.println();

        //TESTEOS USANDO ArrayStream metodos.
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

        System.out.println("a ver como esta el array ");
        for (int i = 0; i < arrayUsingStream.printArray().length; i++) {
            System.out.print(" " + arrayUsingStream.sortArrayDesc()[i] + " ");
        }
        System.out.println();

        //Traer frecuencia

        //Traer moda.
        System.out.println("el numero de moda es: " + arrayUsingStream.traerModa());

        //TESTEOS USANDO ArrayTraditional metodo
        System.out.println("Now we are gonna use traditional methods");

        //Ordenarlo ascendentemente
        System.out.println("Array sorted asc: ");
        arrayTraditional.sortArrayAsc();
        System.out.println();


        //Ordenarlo descendentemente
        System.out.println("Array sorted desc: ");
        arrayTraditional.sortArrayDesc();
        System.out.println();

        //Traer el minimo
        System.out.println("Min number is: " + arrayTraditional.getMin());

        //Traer el maximo
        System.out.println("Max number is: " + arrayTraditional.getMax());

        //Traerfrecuencia
        System.out.println("La frecuencia del numero es: " + arrayTraditional.traerFrecuencia(2));

        //Numero de moda
        System.out.println("El numero de moda es: " + arrayTraditional.traerModa());

    }
}
