package com.company;

public class EnReparacion implements EstadoReparacion{

    Reparacion r;

    public EnReparacion(Reparacion r) {
        this.r = r;
    }

    @Override
    public void cambiarDireccion(String nuevaDireccion) {
        System.out.println("El estado es EN REPARACION. No es posible cambiar la dirección");
    }

    @Override
    public void valorBasicoPresupuesto(Double valor) {
        System.out.println("El estado es EN REPARACION. El presupuesto básico ya fue asignado");
    }

    @Override
    public void addRespuesto(Double valor) {
        r.addCosto(valor);
    }

    @Override
    public EstadoReparacion pasarSiguiente() {
        return new ParaEnvio(this.r);
    }
}
