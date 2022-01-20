package com.company;

public class Reparacion {
    private String nombre;
    private Double costo;
    private String direccionEntrega;
    private EstadoReparacion estado;

    public Reparacion(String nombre, String direccionEntrega) {
        this.nombre = nombre;
        this.direccionEntrega = direccionEntrega;
        this.costo=0.0;
        this.estado=new EnPresupuesto(this);
    }

    public void valorBasicoPresupuesto (Double valor){
        this.estado.valorBasicoPresupuesto(valor);
    }

    public void agregarRepuesto(Double valor){
        this.estado.addRespuesto(valor);
    }

    public void estadoSiguiente(){
        this.estado=this.estado.pasarSiguiente();
        System.out.println("SE HA CAMBIADO EL ESTADO");
    //Producto: "+this.nombre+"\nEstado: "+this.estado.getClass().getSimpleName()+"\nPresupuesto: $"+this.costo+"\nSe enviará a: "+this.direccionEntrega);
        estadoActual();
    }

    public void estadoActual(){
        System.out.println("EL ESTADO ACTUAL DE LA REPARACIÓN ES: \nProducto: "+this.nombre+"\nEstado: "+this.estado.getClass().getSimpleName()+"\nPresupuesto: $"+this.costo+"\nSe enviará a: "+this.direccionEntrega);
    }

    public void addCosto(Double costo) {
        this.costo += costo;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega=direccionEntrega;
    }

    public void cambiarDireccionEntrega(String direccionEntrega) {
        this.estado.cambiarDireccion(direccionEntrega);
    }

    public EstadoReparacion getEstado() {
        return estado;
    }
}
