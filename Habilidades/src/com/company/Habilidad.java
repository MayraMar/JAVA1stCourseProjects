package com.company;

public abstract class Habilidad {
    private String nombre;
    private String descripcion;
    public abstract Double calcularPuntaje();
    public Habilidad(){};

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
