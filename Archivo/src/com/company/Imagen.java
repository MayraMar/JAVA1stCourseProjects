package com.company;

public class Imagen implements Archivo{
    private String nombre;
    public Imagen(String nombre) {
        this.nombre = nombre;
    }
    public void getNombre(){
        System.out.println(this.nombre);
    };
}
