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
            System.out.println(catalogo.get(i).getIdPelicula() + " " + catalogo.get(i).getPelicula());
        }
    }

    /*
    Se recorre la lista corroborando que la pelicula ingresada no se encuentre en el catalogo,
    sino se encuentra, se agrega al catalogo.
     */
    public boolean addPelicula(String pelicula) throws Exception{
        for (int i = 0; i < catalogo.size() ; i++) {
            if (catalogo.get(i).getPelicula().equals(pelicula)){
                throw new Exception("La pelicula ingresada ya se encuentra en el catalogo");
            }
        }
       return catalogo.add(new Pelicula(pelicula));
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
    Se filtra la lista por el idPelicula ingresado, si no se encuentra ninguno se ejecuta la exception.
    Si se encuentra, se actualiza la lista usando el mismo ID pero diferente nombre
    Al final, se ordena para que el objeto no se agregue al final de la lista
     */
    public void updatePelicula (int idPelicula, String pelicula) throws Exception{
        catalogo.stream()
                .filter(x -> x.getIdPelicula()==idPelicula)
                .findAny()
                .orElseThrow(() -> new Exception("La pelicula ingresada no se encuentra en el catalogo"));
        catalogo.set(idPelicula, new Pelicula(idPelicula, pelicula));
        catalogo.stream().sorted();
        System.out.println("la pelicula: " + pelicula + " con id: " + idPelicula + " fue ingresada en el sistema");
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
