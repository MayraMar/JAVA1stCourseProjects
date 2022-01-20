package com.company;

import java.util.ArrayList;

public class HabilidadCombinada extends Habilidad{
    private Integer factorMultiplicador;
    private ArrayList<Habilidad> habilidades;
    public HabilidadCombinada(){
        this.habilidades=new ArrayList<>();
    };
    public void addHabilidad(Habilidad h){
        habilidades.add(h);
    }
    public void removeHabilidad(Habilidad h){
        habilidades.remove(h);
    }

    public void setDatos(String nombre, String descripcion, Integer multiplicador) {
        this.setNombre(nombre);
        this.setDescripcion(descripcion);
        this.factorMultiplicador=multiplicador;
    }

    @Override
    public Double calcularPuntaje() {
        Double puntajeTotal=0.0;
        for (Habilidad h : habilidades) {
            puntajeTotal+=h.calcularPuntaje();
        }
        return puntajeTotal*this.factorMultiplicador;
    }
}
