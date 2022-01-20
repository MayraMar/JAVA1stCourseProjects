package com.company;

public class Main {

    public static void main(String[] args) {
	    Carrito changuito1=new Carrito();
        Producto papasFritas=new Producto("Papas Fritas Pringles",1000.00);
        Producto cerveza=new Producto("Imperial IPA",210.00);
        changuito1.miEstado();
        changuito1.agregarProducto(papasFritas);
        changuito1.miEstado();
        changuito1.mostrarProductos();
        changuito1.agregarProducto(cerveza);
        changuito1.mostrarProductos();
        changuito1.estadoSiguiente();
        changuito1.miEstado();

    }
}
