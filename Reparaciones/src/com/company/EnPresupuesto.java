package com.company;

public class EnPresupuesto implements EstadoReparacion{
    Reparacion r;

    public EnPresupuesto(Reparacion r) {
        this.r = r;
    }

    @Override
    public void cambiarDireccion(String nuevaDireccion) {
        System.out.println("El estado es EN PRESUPUESTO. No es posible cambiar la dirección");
    }

    @Override
    public void valorBasicoPresupuesto(Double valor) {
        r.addCosto(valor);
    }

    @Override
    public void addRespuesto(Double valor) {
        System.out.println("El estado es EN PRESUPUESTO. No es posible agregar repuestos");
    }

    @Override
    public EstadoReparacion pasarSiguiente() {
       return new EnReparacion(this.r);

    }
}
