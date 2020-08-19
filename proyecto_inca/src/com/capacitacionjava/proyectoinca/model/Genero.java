package com.capacitacionjava.proyectoinca.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Genero {

    private int idGenero;
    private String genero;
    private static Map<Integer,String> generos=new HashMap<>();

    public Genero(int idGenero,String genero){
        this.genero=genero;
        this.idGenero=idGenero;
        generos.put(idGenero,genero);
    }

    public String getGenero(){
        return genero;
    }

    @Override
    public boolean equals(Object o) {
        Genero genero1 = (Genero) o;
        return idGenero == genero1.idGenero &&
                Objects.equals(genero, genero1.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGenero, genero);
    }
}
