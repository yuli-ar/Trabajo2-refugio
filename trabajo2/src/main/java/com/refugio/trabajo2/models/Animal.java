package com.refugio.trabajo2.models;

public class Animal {
        private String nombre;
        private String especie;
        private int edad;
        private String raza;

        public Animal(String nombre, String especie, int edad, String raza) {
            this.nombre = nombre;
            this.especie = especie;
            this.edad = edad;
            this.raza = raza;
        }

        public String getNombre() { return nombre; }
        public String getEspecie() { return especie; }
        public int getEdad() { return edad; }
        public String getRaza() { return raza; }
    }

