package com.company;

public class Video implements Archivo{
    private String nombre;
    public Video(String nombre) {
        this.nombre = nombre;
    }
    public void getNombre(){
        System.out.println(this.nombre);
    };
}
