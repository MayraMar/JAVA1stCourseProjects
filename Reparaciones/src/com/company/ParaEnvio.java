package com.company;

public class ParaEnvio implements EstadoReparacion{
    Reparacion r;

    public ParaEnvio(Reparacion r) {
        this.r = r;
    }

    @Override
    public void cambiarDireccion(String nuevaDireccion) {
        r.setDireccionEntrega(nuevaDireccion);
    }

    @Override
    public void valorBasicoPresupuesto(Double valor) {
        System.out.println("El estado es PARA ENVIO. El presupuesto básico ya fue asignado");
    }

    @Override
    public void addRespuesto(Double valor) {
        System.out.println("El estado es PARA ENVIO. Los repuestos ya fueron agregados");
    }

    @Override
    public EstadoReparacion pasarSiguiente() {
        return new Finalizado();
    }
}
