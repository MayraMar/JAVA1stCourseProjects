package com.company;

public class HabilidadSimple extends Habilidad{
    private Double puntaje;
    public HabilidadSimple(){};

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public Double calcularPuntaje() {
        if (this.getNombre().equals("Disparar")){
            return this.puntaje*1.1;
        }
        return this.puntaje;
    }
    public void setDatos(String nombre, String descripcion, Double puntaje){
        this.setNombre(nombre);
        this.setDescripcion(descripcion);
        this.puntaje=puntaje;
    }

    @Override
    public String toString() {
        return "HabilidadSimple{" +
                "puntaje=" + puntaje +
                '}';
    }
}
