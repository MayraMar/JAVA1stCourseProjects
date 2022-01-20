package com.company;

public interface Estado {
    public Estado agregarProducto();
    public Estado cancelarCarro();
    public Estado volverAnterior();
    public Estado siguienteEstado();
}
