package com.capacitacionjava.proyectoinca.test;

import com.capacitacionjava.proyectoinca.model.Incaa;
import com.capacitacionjava.proyectoinca.model.Pelicula;

public class TestPelicula {

    public static void main(String[] args) throws Exception {

        //Object initialization
        Incaa inca = new Incaa();

        //addPeliculas
        inca.addPelicula("El origen");
        inca.addPelicula("El origen de los males");
        inca.addPelicula("IT");
        inca.addPelicula("Actividad paranormal");
        inca.addPelicula("Scary Movie");
        inca.addPelicula("El juego del miedo");
        inca.addPelicula("Destino final");

        //printCatalogo
        System.out.println("Catalogo: ");
        inca.printCatalogo();

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

        //removePelicula
        System.out.println("a continuacion vamos a eliminar la pelicula " + inca.getPelicula(4).getPelicula());
        inca.removePelicula(4);

        System.out.println("Catalogo al final del programa: ");
        inca.printCatalogo();

    }
}
