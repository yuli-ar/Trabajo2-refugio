package com.refugio.trabajo2.repositories;

import com.refugio.trabajo2.models.Animal;
import com.refugio.trabajo2.models.Refugio;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Refugios {

    public static List<Refugio> lista = new ArrayList<>(Arrays.asList(

            new Refugio("Patitas Felices", "Bogotá", 30, 2010, new ArrayList<>(Arrays.asList(
                    new Animal("Jerry", "Gato", 3, "Mestizo - Naranja"),
                    new Animal("Luna", "Perro", 5, "Labrador")))),

            new Refugio("Huellas de Amor", "Medellín", 25, 2015, new ArrayList<>(Arrays.asList(
                    new Animal("Max", "Perro", 2, "Beagle"),
                    new Animal("Mia", "Gato", 4, "Siamés")))),

            new Refugio("Refugio Esperanza", "Cali", 20, 2012, new ArrayList<>(Arrays.asList(
                    new Animal("Rocky", "Perro", 6, "Bulldog"),
                    new Animal("Nala", "Gato", 1, "Persa")))),

            new Refugio("Peluditos", "Barranquilla", 15, 2018, new ArrayList<>(Arrays.asList(
                    new Animal("Simba", "Gato", 2, "Atigrado"),
                    new Animal("Toby", "Perro", 3, "Golden Retriever")))),

            new Refugio("Casita Animal", "Bucaramanga", 10, 2020, new ArrayList<>(Arrays.asList(
                    new Animal("Coco", "Perro", 1, "Chihuahua")))),

            new Refugio("Refugio Nueva Vida", "Bello", 18, 2016, new ArrayList<>(Arrays.asList(
                    new Animal("Canela", "Gato", 5, "Angora"),
                    new Animal("Bruno", "Perro", 4, "Pastor Alemán"),
                    new Animal("Lola", "Gato", 2, "Mestizo - Negro")))),

            new Refugio("Huellitas", "Itagüi", 22, 2014, new ArrayList<>(Arrays.asList(
                    new Animal("Kira", "Perro", 3, "Husky"),
                    new Animal("Milo", "Gato", 6, "Mestizo - Blanco")))),

            new Refugio("Paraíso Animal", "Cartagena", 35, 2009, new ArrayList<>(Arrays.asList(
                    new Animal("Beto", "Perro", 2, "Dálmata"),
                    new Animal("Kitty", "Gato", 3, "Mestizo - Gris")))),

            new Refugio("Refugio San Francisco", "Ibagué", 12, 2019, new ArrayList<>(Arrays.asList(
                    new Animal("Pelusa", "Gato", 1, "Mestizo - Blanco")))),

            new Refugio("Hogar Peludo", "Santa Marta", 28, 2011, new ArrayList<>(Arrays.asList(
                    new Animal("Rex", "Perro", 7, "Rottweiler"),
                    new Animal("Mochi", "Gato", 2, "Café")))),

            new Refugio("Refugio Los Andes", "Tunja", 16, 2017, new ArrayList<>()),

            new Refugio("Amores Peludos", "Pasto", 20, 2013, new ArrayList<>(Arrays.asList(
                    new Animal("Chispas", "Gato", 4, "Mestizo - Naranja"),
                    new Animal("Duque", "Perro", 5, "Boxer")))),

            new Refugio("Corazón Animal", "Neiva", 14, 2021, new ArrayList<>()),

            new Refugio("Finca Urbana", "Villavicencio", 19, 2015, new ArrayList<>(Arrays.asList(
                    new Animal("Perla", "Gato", 3, "Siamés"),
                    new Animal("Thor", "Perro", 4, "Akita"),
                    new Animal("Sophia", "Gato", 1, "Atigrado")))),

            new Refugio("Patas Alegres", "Armenia", 11, 2022, new ArrayList<>(Arrays.asList(
                    new Animal("Pepe", "Perro", 2, "Mestizo")))),

            new Refugio("Refugio Vida Nueva ", "Popayán", 24, 2010, new ArrayList<>(Arrays.asList(
                    new Animal("Gatita", "Gato", 6, "Siamés"),
                    new Animal("Sultan", "Perro", 3, "Doberman")))),

            new Refugio("Animales con Amor", "Montería", 17, 2016, new ArrayList<>()),

            new Refugio("Refugio El Bosque", "Sincelejo", 21, 2014, new ArrayList<>(Arrays.asList(
                    new Animal("Nube", "Gato", 2, "Mestizo - Blanco"),
                    new Animal("Dante", "Perro", 5, "Mestizo")))),

            new Refugio("Huellitas", "Valledupar", 13, 2020, new ArrayList<>(Arrays.asList(
                    new Animal("Copito", "Gato", 1, "Mestizo - Blanco")))),

            new Refugio("Refugio Esperanza 2", "Rionegro", 9, 2023, new ArrayList<>())));
}

