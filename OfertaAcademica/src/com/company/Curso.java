package com.company;

public class Curso extends OfertaAcademica{
    private Double cargaHorariaMes;
    private Double duracionMes;
    private Double valorHora;
    public Curso(){};

    @Override
    public Double calcularPrecio() {
        return cargaHorariaMes*duracionMes*valorHora;
    }

    public void setCargaHorariaMes(Double cargaHorariaMes) {
        this.cargaHorariaMes = cargaHorariaMes;
    }

    public void setDuracionMes(Double duracionMes) {
        this.duracionMes = duracionMes;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "cargaHorariaMes=" + cargaHorariaMes +
                ", duracionMes=" + duracionMes +
                ", valorHora=" + valorHora +
                '}';
    }
}
