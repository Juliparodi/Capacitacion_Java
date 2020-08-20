package com.capacitacionjava.proyectoinca.model;

import java.util.Objects;

public class Pelicula {

    private int idPelicula;
    private static int counter = 0;
    private String pelicula = "";
    private Genero genero;

    public Pelicula(String pelicula) {
        this.idPelicula = counter++;
        this.pelicula = pelicula;
    }

    public Pelicula(String pelicula, Genero genero) {
        this.idPelicula = counter++;
        this.pelicula = pelicula;
        this.genero = genero;
    }

    public Pelicula(int idPelicula, String pelicula){
        this.idPelicula = idPelicula;
        this.pelicula = pelicula;
    }

    public Pelicula(int idPelicula, String pelicula, Genero genero){
        this.idPelicula = idPelicula;
        this.pelicula = pelicula;
        this.genero = genero;
    }


    public int getIdPelicula() {
        return idPelicula;
    }

    public String getPelicula() {
        return pelicula;
    }

    public Genero getGenero() { return genero; }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object o) {
        Pelicula pelicula1 = (Pelicula) o;
        return Objects.equals(pelicula, pelicula1.pelicula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pelicula);
    }

    @Override
    public String toString() {
        return "{" +
                "idPelicula=" + idPelicula +
                ", pelicula='" + pelicula + '\'' +
                ", genero=" + genero.getGenero() +
                '}' + "\n";
    }


}

