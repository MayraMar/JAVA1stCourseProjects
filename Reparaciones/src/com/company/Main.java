package com.company;

public class Main {

    public static void main(String[] args) {
	Reparacion batidoraRota=new Reparacion("batidora","Calle Falsa 123");
    //Verifico que esta en presupuesto
    batidoraRota.estadoActual();
    batidoraRota.agregarRepuesto(100.0);
    batidoraRota.valorBasicoPresupuesto(170.0);
    batidoraRota.estadoSiguiente();
    //Paso a en reparacion. Me deberia dar dos errores.
    batidoraRota.cambiarDireccionEntrega("sas");
    batidoraRota.valorBasicoPresupuesto(3.0);
    batidoraRota.agregarRepuesto(100.0);
    batidoraRota.agregarRepuesto(25.0);
    // Paso a ParaEnvio. Costo es 295
    batidoraRota.estadoSiguiente();
    batidoraRota.cambiarDireccionEntrega("Calle verdadera 999");
    batidoraRota.agregarRepuesto(25.0);
    batidoraRota.estadoSiguiente();
    }
}
