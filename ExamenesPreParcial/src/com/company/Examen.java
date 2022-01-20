package com.company;

public abstract class Examen {
    private String titulo;
    private String enunciado;
    private Double nota;
    private Alumno alumno;
    public static final int NOTA_MINIMA_APROBADA=4;

    public Examen(String titulo, String enunciado, Double nota, Alumno alumno) {
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
        this.alumno=alumno;
    }

    public Double getNota() {
        return nota;
    }
    public boolean estaAprobado(){
        return getNota()>=NOTA_MINIMA_APROBADA;
    }
}
