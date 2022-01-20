package com.company;
import java.util.ArrayList;

public class Carrito {
    private Estado estadoActual;
    private ArrayList<Producto> productos;
    public Carrito() {
        this.estadoActual = new Vacio();
        this.productos=new ArrayList<>();
    }
public void miEstado(){
    System.out.println(this.estadoActual.getClass());
}
public void agregarProducto(Producto producto){
    this.estadoActual=this.estadoActual.agregarProducto();
    if (this.estadoActual instanceof Vacio || this.estadoActual instanceof Cargando)
        this.productos.add(producto);
}
    public void estadoSiguiente(){
        this.estadoActual=this.estadoActual.siguienteEstado();
    }
    public Integer cantidadProductos() {
        return productos.size();
    }

    public void mostrarProductos() {
        for (Producto producto : productos)
              {
                  System.out.println(producto.getDescripcion());

        }
    }
}
