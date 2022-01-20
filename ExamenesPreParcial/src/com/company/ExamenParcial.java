package com.company;

public class ExamenParcial extends Examen{
    private Integer numeroUnidad;
    private Integer reintentos;
    public static final int INTENTOS_MAXIMOS_UNIDAD_1_2_3=3;
    public static final int INTENTOS_MAXIMOS_UNIDAD_4_EN_ADELANTE=2;


    public ExamenParcial(String titulo, String enunciado, Double nota, Alumno alumno, Integer numeroUnidad) {
        super(titulo, enunciado, nota, alumno);
        this.numeroUnidad = numeroUnidad;
        this.reintentos=0;
    }

    public void setReintentos(Integer reintentos) {
        this.reintentos = reintentos;
    }

    public boolean puedeRecuperar(){
        if (this.numeroUnidad<4){
            return this.reintentos<INTENTOS_MAXIMOS_UNIDAD_1_2_3;
        } else return this.reintentos<INTENTOS_MAXIMOS_UNIDAD_4_EN_ADELANTE;
    }
}
