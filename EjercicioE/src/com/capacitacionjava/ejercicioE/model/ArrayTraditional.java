package com.capacitacionjava.ejercicioE.model;

import java.util.Arrays;

public class ArrayTraditional extends ArrayUnidimensional {

    public ArrayTraditional(int size) {
        super(size);
    }

   // int[] array = ArrayUnidimensional.getArray();

    public int getMin(){
        int min = ArrayUnidimensional.getArray()[0];
        for (int i = 0; i < ArrayUnidimensional.getArray().length; i++) {
            if (ArrayUnidimensional.getArray()[i] < min){
                min = ArrayUnidimensional.getArray()[i];
            }
        }
        return min;
    }

    public int getMax(){
        int max = ArrayUnidimensional.getArray()[0];
        for (int i = 0; i < ArrayUnidimensional.getArray().length ; i++) {
            if (ArrayUnidimensional.getArray()[i] > max){
                max = ArrayUnidimensional.getArray()[i];
            }
        }
        return max;
    }

    public double avg(){
        double sum = 0;
        for (int i = 0; i < ArrayUnidimensional.getArray().length ; i++){
            sum = sum + ArrayUnidimensional.getArray()[i];
        }
        return (sum / ArrayUnidimensional.getArray().length);
    }

    //Ordena el array con el metodo .sort y luego imprime resultado.
    public void sortArrayAsc(){
        Arrays.sort(ArrayUnidimensional.getArray());
        for (int i = 0; i < ArrayUnidimensional.getArray().length; i++) {
            System.out.print(" " + ArrayUnidimensional.getArray()[i] + " ");
        }
    }

    //uso del algoritmo SWAP para ordenar array de forma DESC
    public void sortArrayDesc() {
        int temp;
        for (int i = 0; i < ArrayUnidimensional.getArray().length; i++) {
            for (int j = i+1; j < ArrayUnidimensional.getArray().length; j++) {
                if (ArrayUnidimensional.getArray()[i] < ArrayUnidimensional.getArray()[j]) {
                    temp = ArrayUnidimensional.getArray()[i];
                    ArrayUnidimensional.getArray()[i] = ArrayUnidimensional.getArray()[j];
                    ArrayUnidimensional.getArray()[j] = temp;
                }
            }
        }

        for (int i = 0; i < ArrayUnidimensional.getArray().length; i++) {
            System.out.print(" " + ArrayUnidimensional.getArray()[i] + " ");
        }
    }

    /*
    Cuenta la cantidad de veces que el param @num se encuentra dentro del array y luego se haya
    el cociente entre la # de veces que aparece y el length del array
    */
    public double traerFrecuencia(int num){
        double count = 0;
        for (int i = 0; i < ArrayUnidimensional.getArray().length; i++) {
            if (num == ArrayUnidimensional.getArray()[i]){
                count++;
            }
        }
        return count / ArrayUnidimensional.getArray().length;
    }

    /*
    Uso del doble for para comparar cada numero y el que tenga mayores "count" va a ser el
    numero retornado x la funcion
     */
    public int traerModa(){
        int count = 0;
        int numModa = 0;
        int maxCounts = 0;
        for (int i = 0; i < ArrayUnidimensional.getArray().length; i++) {
            for (int j = 0; j < ArrayUnidimensional.getArray().length; j++) {
                if (ArrayUnidimensional.getArray()[i] == ArrayUnidimensional.getArray()[j]){
                    count++;
                }
            }
            if (count > maxCounts){
                maxCounts = count;
                numModa = ArrayUnidimensional.getArray()[i];
            }
            count = 0;
        }
        return numModa;
    }
/*
    public int traerModa(){
        int modaMaxima=0;
        int numero=0;
        for (int i=0;i<array.length;i++){
            if (contar(array[i])>modaMaxima){
                numero=array[i];
                modaMaxima=contar(array[i]);
            }

        }
        return numero;
    }
    */

}
