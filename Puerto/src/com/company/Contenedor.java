package com.company;

public class Contenedor implements Comparable<Contenedor> {
    private Integer numeroId;
    private String paisProcedencia;
    private Boolean materialesPeligrosos;

    public Contenedor(Integer numeroId, String paisProcedencia, Boolean materialesPeligrosos) {
        this.numeroId = numeroId;
        this.paisProcedencia = paisProcedencia;
        this.materialesPeligrosos = materialesPeligrosos;
    }

    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    @Override
    public int compareTo(Contenedor o) {
        return this.numeroId-o.numeroId;
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "numeroId=" + numeroId +
                ", paisProcedencia='" + paisProcedencia + '\'' +
                ", materialesPeligrosos=" + materialesPeligrosos +
                '}';
    }

    public Boolean getMaterialesPeligrosos() {
        return materialesPeligrosos;
    }
}
