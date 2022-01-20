package com.company;

import java.util.ArrayList;

public class Carpeta implements Archivo{
    private String nombre;
    private ArrayList<Archivo> archivosContenidos;

    public Carpeta(String nombre) throws Exception{
        if(nombre.length()>20){
            throw new Exception("Nombre de carpeta demasiado largo: "+nombre );
        }
        this.nombre = nombre;
        this.archivosContenidos=new ArrayList<>();
    }
    public void addArchivo(Archivo a){
        this.archivosContenidos.add(a);
    }
    public void getNombre() {
        System.out.println("-----------------------\nCARPETA: "+this.nombre);
        for(Archivo a:this.archivosContenidos){
            a.getNombre();
        }
        System.out.println("-----------------------");
    }
}
