package com.company;

import java.util.ArrayList;

public class Institucion {
    private String nombre;
    private ArrayList<OfertaAcademica> oferta;

    public Institucion(String nombre) {
        this.nombre = nombre;
        this.oferta=new ArrayList();
    }
    public void agregarOferta(OfertaAcademica oa){
        oferta.add(oa);
    }
    public void generarInforme(){
        System.out.println("Oferta academica de "+this.nombre);
        for (OfertaAcademica oa : oferta) {
            System.out.println("Nombre: "+oa.getNombre()+" - Precio: "+oa.calcularPrecio());
        }
    }
}
