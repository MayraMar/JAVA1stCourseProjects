package com.company;

import java.util.ArrayList;

public class ArchivoComposite implements Archivo{
    private ArrayList<Archivo> archivosHijos;

    public ArchivoComposite() {
        this.archivosHijos = new ArrayList<>();
    }

    public void addArchivo(Archivo a){
        this.archivosHijos.add(a);
    }
    public void removeArchivo(Archivo a){
        this.archivosHijos.remove(a);
    }
    public void getNombre(){
        for (Archivo a: this.archivosHijos
             ) {
            a.getNombre();
        }
    };
}
