package com.company;

public class Main {

    public static void main(String[] args) {
	ProductoFactory fabrica=ProductoFactory.getInstance();
    Producto pelotaTenis=fabrica.crearProducto("PELOTATENIS");
        System.out.println(pelotaTenis);
    }
}
