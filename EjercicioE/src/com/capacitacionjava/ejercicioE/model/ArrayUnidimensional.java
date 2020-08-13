package com.capacitacionjava.ejercicioE.model;

import java.util.Random;

public class ArrayUnidimensional {

    private static int[] example;

    public ArrayUnidimensional(int size){
        example = new int[size];
    }

    public ArrayUnidimensional(){
        example = new int[]{2,3,2,4,2,3};
    }

    public static int[] getExample() {
        return example;
    }


    public void fillArray(){
        for (int i = 0; i < example.length; i++) {
            example[i] = ArrayUnidimensional.randomNumber();
        }
    }

    public static int randomNumber(){
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(50) + 1;
    }

}
