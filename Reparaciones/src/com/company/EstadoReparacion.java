package com.company;

public interface EstadoReparacion {
    public void cambiarDireccion(String nuevaDireccion);
    public void valorBasicoPresupuesto (Double valor);
    public void addRespuesto (Double valor);
    public EstadoReparacion  pasarSiguiente();

}
