package com.refugio.trabajo2.models;
import java.util.List;
public class Refugio {
    private String nombre;
    private String ciudad;
    private int capacidad;
    private int añoFundacion;
    private List<Animal> animales;

    public Refugio(String nombre, String ciudad, int capacidad, int añoFundacion, List<Animal> animales) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
        this.añoFundacion = añoFundacion;
        this.animales = animales;
    }

    public String getNombre() { return nombre; }
    public String getCiudad() { return ciudad; }
    public int getCapacidad() { return capacidad; }
    public int getAnioFundacion() { return añoFundacion; }
    public List<Animal> getAnimales() { return animales; }

}
