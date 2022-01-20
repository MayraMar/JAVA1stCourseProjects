package com.company;

public class Cerrado implements Estado{
    @Override
    public Estado agregarProducto() {
        return this;
    }

    @Override
    public Estado cancelarCarro() {
        return this;
    }

    @Override
    public Estado volverAnterior() {
        return this;
    }

    @Override
    public Estado siguienteEstado() {
        return new Vacio();
    }
}
