package com.company;

public class ProductoFactory {
    private static ProductoFactory instance;
    private ProductoFactory(){

    }

    public static ProductoFactory getInstance(){
        if (instance==null){
            instance = new ProductoFactory();
        }
        return  instance;
    }

    public Producto crearProducto(String cod){
        Producto resultado=null;
        switch(cod) {
            case "CAJA10X10":
                resultado=new Caja(1.0,10.0,10.0,10.0);
                break;
            case "PELOTAFUTBOL":
                resultado=new Pelota(1.0,11.0);
                break;
            case "PELOTATENIS":
                resultado=new Pelota(0.20,0.32);
                break;


        }
        return resultado;
    }
}
