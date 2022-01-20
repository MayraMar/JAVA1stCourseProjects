package com.company;

public class Pelota extends Producto{
    private Double radio;

    public Pelota(Double peso, Double radio) {
        super(peso);
        this.radio = radio;
    }

    @Override
    public Double calcularEspacio() {
        return null;
    }

    @Override
    public String toString() {
        return "soy una pelota de radio = " + this.radio + "cm.";
    }
}
