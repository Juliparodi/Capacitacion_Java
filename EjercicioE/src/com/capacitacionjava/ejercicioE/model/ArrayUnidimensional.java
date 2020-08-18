package com.capacitacionjava.ejercicioE.model;

import java.util.concurrent.ThreadLocalRandom;

public class ArrayUnidimensional {

    private static int[] array;

    public ArrayUnidimensional(int size){
        array = new int[size];
    }



    public static int[] getArray() {
        return array;
    }


    public void fillArray(){
        for (int i = 0; i < array.length; i++) {
           array[i] = ThreadLocalRandom.current().nextInt(1,10);
        }
    }


}
