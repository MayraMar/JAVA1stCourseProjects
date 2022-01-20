package com.company;

public class Texto implements Archivo{
    private String nombre;

    public Texto(String nombre) {
        this.nombre = nombre;
    }

    public void getNombre(){
        System.out.println(this.nombre);
    };

}
