package com.company;

import com.company.Contenedor;

import java.util.ArrayList;
import java.util.List;

public class Puerto {
    private String nombre;
    private List <Contenedor> contenedores;

    public Puerto(String nombre) {
        this.nombre = nombre;
        this.contenedores=new ArrayList();
    }

    public Puerto(String nombre, List<Contenedor> contenedores) {
        this.nombre = nombre;
        this.contenedores = contenedores;
    }

    public String getNombre() {
        return nombre;
    }

    public void addContenedor(Contenedor contenedor){
        contenedores.add(contenedor);
    }

    public List<Contenedor> getContenedores() {
        return contenedores;
    }
}
