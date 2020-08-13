package com.capacitacionjava.ejercicioE.model;

import java.util.Arrays;

public class ArrayTraditional extends ArrayUnidimensional {


    public int getMin(){
        int min = ArrayUnidimensional.getExample()[0];
        for (int i = 0; i < ArrayUnidimensional.getExample().length; i++) {
            if (ArrayUnidimensional.getExample()[i] < min){
                min = ArrayUnidimensional.getExample()[i];
            }
        }
        return min;
    }

    public int getMax(){
        int max = ArrayUnidimensional.getExample()[0];
        for (int i = 0; i < ArrayUnidimensional.getExample().length ; i++) {
            if (ArrayUnidimensional.getExample()[i] > max){
                max = ArrayUnidimensional.getExample()[i];
            }
        }
        return max;
    }

    public void sortArrayAsc(){
        int[] arraySorted = ArrayUnidimensional.getExample();
        Arrays.sort(ArrayUnidimensional.getExample());
        for (int i = 0; i < ArrayUnidimensional.getExample().length; i++) {
            System.out.print(" " + ArrayUnidimensional.getExample()[i] + " ");
        }
    }

    public void sortArrayDesc() {
        int temp;
        for (int i = 0; i < ArrayUnidimensional.getExample().length; i++) {
            for (int j = 1; j < ArrayUnidimensional.getExample().length; j++) {
                if (ArrayUnidimensional.getExample()[i] < ArrayUnidimensional.getExample()[j]) {
                    temp = ArrayUnidimensional.getExample()[i];
                    ArrayUnidimensional.getExample()[i] = ArrayUnidimensional.getExample()[j];
                    ArrayUnidimensional.getExample()[j] = temp;
                }
            }
        }

        for (int i = 0; i < ArrayUnidimensional.getExample().length; i++) {
            System.out.print(" " + ArrayUnidimensional.getExample()[i] + " ");
        }
    }


    public double traerFrecuencia(int num){
        double count = 0;
        for (int i = 0; i < ArrayUnidimensional.getExample().length; i++) {
            if (num == ArrayUnidimensional.getExample()[i]){
                count++;
            }
        }
        if (count == 0) {return 0;}
        else {
           return (count / ArrayUnidimensional.getExample().length);
        }
    }

    public int traerModa(){
        int count = 0;
        int numModa = 0;
        int maxCounts = 0;
        for (int i = 0; i < ArrayUnidimensional.getExample().length; i++) {
            for (int j = 0; j < ArrayUnidimensional.getExample().length; j++) {
                if (ArrayUnidimensional.getExample()[i] == ArrayUnidimensional.getExample()[j]){
                    count++;
                }
            }
            if (count > maxCounts){
                maxCounts = count;
                numModa = ArrayUnidimensional.getExample()[i];
            }
            count = 0;
        }
        return numModa;
    }
}
