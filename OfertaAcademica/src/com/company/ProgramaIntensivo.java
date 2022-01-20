package com.company;

import java.util.ArrayList;

public class ProgramaIntensivo extends OfertaAcademica{
    private ArrayList<OfertaAcademica> listado;
    private Double porcentajeDescuento;


    public ProgramaIntensivo() {
        this.listado = new ArrayList<>();
    }

    public void addOfertaAcademica  (OfertaAcademica oa){
        listado.add(oa);
    }
    public void removeOfertaAcademica (OfertaAcademica oa){
        this.listado.remove(oa);
    }

    public void setPorcentajeDescuento(Double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public Double calcularPrecio() {
        Double total=0.0;
        for (OfertaAcademica oa : listado) {
            total+=oa.calcularPrecio();
        }
        return total-(total*this.porcentajeDescuento/100);
    }

    @Override
    public String toString() {
        return "ProgramaIntensivo{" +
                "listado=" + listado +
                ", porcentajeDescuento=" + porcentajeDescuento +
                '}';
    }
}
