package com.company;

public class Asteroide extends Objeto{
    private int lesion;

    public Asteroide(int posx, int posy, char direccion, int lesion) {
        super(posx, posy, direccion);
        this.lesion = lesion;
    }

    @Override
    public String toString() {
        return "Soy un Asteroide y estoy en x:" + getPosx() + " y: "+ getPosy();
    }
}
