package com.company;

import java.util.ArrayList;

public class Personaje {
    private String nombre;
    private ArrayList<Habilidad> habilidades;
    public Personaje(String nombre){
        this.nombre=nombre;
        this.habilidades=new ArrayList<>();
    }
    public void agregar (Habilidad h){
        habilidades.add(h);
    }
    public void mostrarHabilidades(){
        System.out.println("Listado de habilidades de "+nombre+":");
        for (Habilidad h : habilidades) {
            System.out.println("Habilidad: "+h.getNombre()+".  Puntaje: "+h.calcularPuntaje());
        }
        System.out.println("-----   Fin de habilidades de  "+nombre+".    -----");
    }
}
