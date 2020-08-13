package com.capacitacionjava.ejercicioE.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class ArrayStream extends ArrayUnidimensional{

    public int[] printArray(){
            return ArrayUnidimensional.getExample();
    }
    public int getMin(){
      int min = Arrays.stream(ArrayUnidimensional.getExample())
                .min()
                .getAsInt();
      return min;
    }

    public int getMax() {
        int max = Arrays.stream(ArrayUnidimensional.getExample())
                .max()
                .getAsInt();
        return max;
    }

    public double average() {
        double avg = Arrays.stream(ArrayUnidimensional.getExample())
                .average()
                .getAsDouble();
        return avg;
    }

    public int[] sortArrayAsc() {
        IntStream sortArray =  Arrays.stream(ArrayUnidimensional.getExample().clone())
                .sorted();
                sortArray.toArray();
        return ArrayUnidimensional.getExample();
    }

    public Integer[] sortArrayDesc() {
        Integer[] desc = Arrays.stream(ArrayUnidimensional.getExample().clone())
                .boxed()
                .toArray(Integer[]::new);
        Arrays.sort(desc, Collections.reverseOrder());
        return desc;
    }

    //public double traerFrecuencia(int num){ }

    //Google
    public int traerModa(){
        Map<Integer, Long> counts = IntStream.of(ArrayUnidimensional.getExample()).boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        Long max = counts.values().stream().max(Comparator.naturalOrder()).get();
        int mode = counts.entrySet().stream()
                .filter(e -> e.getValue().equals(max))
                .min(Comparator.comparing(Map.Entry::getKey)).get().getKey();
        return mode;
    }
}
