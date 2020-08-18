package com.capacitacionjava.ejercicioE.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;


public class ArrayStream extends ArrayUnidimensional {

    public ArrayStream(int size) {
        super(size);
    }

    public int[] printArray() {
        return ArrayUnidimensional.getArray();
    }

    public int getMin() {
        return Arrays.stream(ArrayUnidimensional.getArray())
                .min()
                .getAsInt();
    }

    public int getMax() {
        return  Arrays.stream(ArrayUnidimensional.getArray())
                .max()
                .getAsInt();
    }

    public double average() {
     return Arrays.stream(ArrayUnidimensional.getArray())
                .average()
                .getAsDouble();
    }

    /*
    Convierte el array en stream, lo ordena y lo vuelve a convertir en array para devolverlo.
     */
    public int[] sortArrayAsc() {
        IntStream sortArray = Arrays.stream(ArrayUnidimensional.getArray())
                .sorted();
     return   sortArray.toArray();

    }

    //Convierto el array primitivo en una wrap class Integer para hacer uso del "Collections.reverseOrder()
    public Integer[] sortArrayDesc() {
        Integer[] desc = Arrays.stream(ArrayUnidimensional.getArray())
                .boxed()
                .toArray(Integer[]::new);
        Arrays.sort(desc, Collections.reverseOrder());
        return desc;
    }

    /*
    El metodo va a retornar la frecuencia del numero dado como parametro.
     */
    public double traerFrecuencia(int num) {
        float total = Arrays.stream(ArrayUnidimensional.getArray()).count();
        double freq = Arrays.stream(ArrayUnidimensional.getArray())
                .filter(x -> x == num)
                .count();
        return freq / total;
    }

    //Google
    public int traerModa() {
        Map<Integer, Long> counts = IntStream.of(ArrayUnidimensional.getArray()).boxed()
                .collect(groupingBy(x -> x, counting()));
        Long max = counts.values().stream().max(Comparator.naturalOrder()).get();
        return counts.entrySet().stream()
                .filter(e -> e.getValue().equals(max))
                .min(Comparator.comparing(Map.Entry::getKey)).get().getKey();
    }

}
