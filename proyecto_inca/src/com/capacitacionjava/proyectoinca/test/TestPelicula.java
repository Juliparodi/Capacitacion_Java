package com.capacitacionjava.proyectoinca.test;

import com.capacitacionjava.proyectoinca.model.Genero;
import com.capacitacionjava.proyectoinca.model.Incaa;
import com.capacitacionjava.proyectoinca.model.Pelicula;

import java.util.Arrays;

public class TestPelicula {

    public static void main(String[] args) throws Exception {

        //Object initialization
        Incaa inca = new Incaa();
        Genero genero=new Genero(1,"Terror");
        Genero genero1=new Genero(2,"Ciencia Ficcion");
        Genero genero2=new Genero(3,"Comedia");
        //Genero genero3=new Genero(3,"Comedia"); (Genera Exception)


        //addPeliculas
        inca.addPelicula("El origen", genero);
        inca.addPelicula("El origen de los males", genero);
        inca.addPelicula("IT", genero);
        inca.addPelicula("Star Wars", genero1);
        inca.addPelicula("Scary Movie", genero2);
        inca.addPelicula("El juego del miedo", genero);
        inca.addPelicula("Los 4 fantasticos", genero1);
        inca.addPelicula("Shrek", genero1);

        //printCatalogo
        System.out.println("Catalogo: ");
        System.out.println(Arrays.toString(inca.getCatalogo().toArray()));
        //getPeliculabyID
        Pelicula pelicula = inca.getPelicula(1);
        System.out.println("La pelicula seleccionada es: " + pelicula.getPelicula());

        //getPeliculabyString
        System.out.println("La/las peliculas que contiene ori son: ");
        for (Pelicula peliculas : inca.getPelicula("ori")) {
            System.out.println(peliculas.getPelicula());
        }

        //updatePelicula
        inca.updatePelicula(2, "Harry Potter");
        //inca.updatePelicula(50, "ET"); (Genera Exception)

        //removePelicula
        System.out.println("a continuacion vamos a eliminar la pelicula " + inca.getPelicula(4).getPelicula());
        inca.removePelicula(4);
        //inca.removePelicula(40); (Genera NullPointerException)

        //getPeliculabyGenero
        System.out.println("La/las peliculas del genero " + genero.getGenero() + " son: ");
        for (Pelicula peliculas : inca.getPelicula(genero)) {
            System.out.println(peliculas.getPelicula());
        }

        System.out.println("Catalogo al final del programa: ");
        System.out.println(Arrays.toString(inca.getCatalogo().toArray()));
    }
}
