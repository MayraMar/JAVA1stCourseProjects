package com.company;

public class Nave extends Objeto{
    private Double velocidad;
    private int vida;

    public Nave(int posx, int posy, char direccion, Double velocidad) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
    }

    public void girar(char direccion){
        setDireccion(direccion);
    }
    public void restaVida(int valor){
        this.vida-=valor;
    }

    @Override
    public void irA(int x, int y, char direccion){
    if(getDireccion()==direccion){
        setPosx(x);
        setPosy(y);
    } else {
        girar(direccion);
        setPosx(x);
        setPosy(y);
    }
    }


}
