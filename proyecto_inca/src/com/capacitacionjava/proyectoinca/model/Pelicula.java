package com.capacitacionjava.proyectoinca.model;

import java.util.Objects;

public class Pelicula {

    private int idPelicula;
    private static int counter = 0;
    private String pelicula = "";

    public Pelicula(String pelicula) {
        this.idPelicula = counter++;
        this.pelicula = pelicula;
    }

    public Pelicula(int idPelicula, String pelicula){
        this.idPelicula = idPelicula;
        this.pelicula = pelicula;
    }


    public int getIdPelicula() {
        return idPelicula;
    }

    public String getPelicula() {
        return pelicula;
    }

    public boolean equals(String pelicula) {
        return getPelicula().equals(pelicula);
    }

    public boolean equals(int idPelicula){return getPelicula().equals(idPelicula);}

    @Override
    public int hashCode() {
        return Objects.hash(pelicula);
    }


}
