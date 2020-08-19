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
    public void printCatalogo(){
        for (int i = 0; i < catalogo.size(); i++) {
            System.out.println(catalogo.get(i).toString());
        }
    }

    /*
    Se recorre la lista corroborando que la pelicula ingresada no se encuentre en el catalogo,
    sino se encuentra, se agrega al catalogo.
     */
    public boolean addPelicula(String pelicula, Genero genero) throws Exception{
        for (int i = 0; i < catalogo.size() ; i++) {
            if (catalogo.get(i).getPelicula().equals(pelicula)){
                throw new Exception("La pelicula ingresada ya se encuentra en el catalogo");
            }
        }
       return catalogo.add(new Pelicula(pelicula, genero));
    }

    /*
    Si se encuentra la pelicula, se devuelve.
     */
     public Pelicula getPelicula(int idPelicula){
        Pelicula pelicula = catalogo.stream()
                .filter(x -> x.getIdPelicula()==(idPelicula))
                .findFirst()
                .orElse(null);
        return pelicula;
    }

    /*
    Se filtra la lista para saber si contiene parte de la pelicula ingresada como @param
    Todas las coincidencias, se guardan en una lista y se retorna.
     */
    public List<Pelicula> getPelicula(String partePelicula){
        List<Pelicula> pelicula = catalogo.stream()
                .filter(x -> x.getPelicula().contains(partePelicula))
                .collect(Collectors.toList());
        return pelicula;
    }

    /*
    Se filtra la lista para determinar las peliculas que tienen el genero dado como @param
    Todas las coincidencias, se guardan en una lista y se retorna.
     */
    public List<Pelicula> getPelicula(Genero genero){
        List<Pelicula> pelicula = this.catalogo.stream()
                .filter(x -> x.getGenero().equals(genero))
                .collect(Collectors.toList());
        return pelicula;
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
    Sino, se eliminar la pelicula y se devuelve true.
     */
    public boolean removePelicula (int idPelicula) throws Exception{
        if (getPelicula(idPelicula).equals(null)){
            throw new Exception("La pelicula ingresada no existe en nuestro catalogo");
        }
        else {
            catalogo.remove(getPelicula(idPelicula));
            return true;
        }
    }

}
