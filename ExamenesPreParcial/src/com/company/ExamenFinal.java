package com.company;

public class ExamenFinal extends Examen implements Comparable{
    private Double notaOral;
    private String temaOral;

    public ExamenFinal(String titulo, String enunciado, Double nota, Alumno alumno, String temaOral) {
        super(titulo, enunciado, nota, alumno);
        this.temaOral = temaOral;
    }
    public void setNotaOral(Double nota){
        this.notaOral=nota;
    }

    @Override
    public boolean estaAprobado() {
        return (super.estaAprobado() && this.notaOral>NOTA_MINIMA_APROBADA);
    }
    public Double getPromedio() {
        return (this.notaOral+this.getNota())/2;
    }

    @Override
    public int compareTo(Object o) {
        return (int)(this.getPromedio()-((ExamenFinal)o).getPromedio());
    }
}




