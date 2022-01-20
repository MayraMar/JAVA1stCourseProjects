package com.company;

public class Pagando implements Estado{
    @Override
    public Estado agregarProducto() {
        return this;
    }

    @Override
    public Estado cancelarCarro() {
        return new Vacio();
    }

    @Override
    public Estado volverAnterior() {
        return new Cargando();
    }

    @Override
    public Estado siguienteEstado() {
        return new Cerrado();
    }
}
