package com.company;

public class Finalizado implements EstadoReparacion{
    Reparacion r;
    @Override
    public void cambiarDireccion(String nuevaDireccion) {
        System.out.println("El estado es FINALIZADO. No se puede modificar la dirección");
    }

    @Override
    public void valorBasicoPresupuesto(Double valor) {
        System.out.println("El estado es FINALIZADO. El presupuesto básico ya fue asignado");
    }

    @Override
    public void addRespuesto(Double valor) {
        System.out.println("El estado es FINALIZADO. Los repuestos ya fueron agregados");
    }

    @Override
    public EstadoReparacion pasarSiguiente() {
        return r.getEstado();
    }
}
