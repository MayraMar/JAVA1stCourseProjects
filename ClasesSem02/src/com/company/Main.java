package com.company;

public class Main {

    public static void main(String[] args) {
    Perro toto=new Perro ("toto","salchicha");
    toto.setPeso(10.0);
    toto.enviarAdopcion();
    toto.estado();
    toto.setChip(true);
    toto.estado();
        System.out.println(toto.sePierde());
    }
}
