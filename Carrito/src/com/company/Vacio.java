package com.company;

public class Vacio implements Estado{
    @Override
    public Estado agregarProducto() {
        return new Cargando();
    }

    @Override
    public Estado cancelarCarro() {
        return new Vacio();
    }

    @Override
    public Estado volverAnterior() {
        return this;
    }

    @Override
    public Estado siguienteEstado() {
        return new Cargando();
    }
}
