package com.company;

public class Cargando implements Estado{
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
        return new Vacio();
    }

    @Override
    public Estado siguienteEstado() {
        return new Pagando();
    }
}
