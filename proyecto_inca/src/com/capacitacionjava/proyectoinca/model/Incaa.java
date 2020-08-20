package com.capacitacionjava.proyectoinca.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Incaa {

    private List<Pelicula> catalogo;

    public Incaa() {
        this.catalogo = new ArrayList<>();
    }

    //printAllPeliculas
    public List<Pelicula> getCatalogo(){
        return catalogo;
    }

    /*
    Filtra la lista corroborando que la pelicula ingresada no se encuentre en el catalogo,
    si se encuentra arroja una exception y sino, se agrega.
     */
    public boolean addPelicula(String pelicula, Genero genero) throws Exception{
        catalogo.stream().filter(x -> x.getPelicula().equals(pelicula))
                .findAny()
                .ifPresent(x -> {throw new IllegalArgumentException("La pelicula ingresada ya se encuentra en el catalogo");});
        return catalogo.add(new Pelicula(pelicula, genero));
    }

    /*
    Si se encuentra la pelicula, se devuelve.
     */
     public Pelicula getPelicula(int idPelicula){
       return catalogo.stream()
                .filter(x -> x.getIdPelicula()==(idPelicula))
                .findFirst()
                .orElse(null);
    }

    /*
    Se filtra la lista para saber si contiene parte de la pelicula ingresada como @param
    Todas las coincidencias se guardan en una lista y se chequea si la lista esta vacia y sino, se retorna.
     */
    public List<Pelicula> getPelicula(String partePelicula) throws Exception{
        return catalogo.stream()
                .filter(x -> x.getPelicula().contains(partePelicula))
                .collect(Collectors.toList());
    }

    /*
    Se filtra la lista para determinar las peliculas que tienen el genero dado como @param
    Todas las coincidencias se guardan en una lista y sino esta vacia, se retorna.
     */
    public List<Pelicula> getPelicula(Genero genero) throws Exception{
        return this.catalogo.stream()
                .filter(x -> x.getGenero().equals(genero))
                .collect(Collectors.toList());
    }

    /*
    Busca la pelicula x id y si la encuentra, la actualiza con el nuevo string pelicula
     */
    public void updatePelicula(int id,String pelicula) throws Exception {
        try {
            getPelicula(id).setPelicula(pelicula);
            System.out.println("La pelicula " + pelicula + " se agrego exitosamente");
        } catch (Exception e){
            throw  new Exception("No se pudo realizar porque no se encontro pelicula");
        }
    }

    /*
    Se llama a la funcion getPelicula ya definida, si devuelve null se ejecuta la Exception.
    Sino, se elimina la pelicula y se devuelve true.
     */
    public boolean removePelicula (int idPelicula) throws Exception {
        if (getPelicula(idPelicula)==(null)){
            throw new NullPointerException("La pelicula ingresada no existe en nuestro catalogo");
        }
            catalogo.remove(getPelicula(idPelicula));
            return true;
        }
}

