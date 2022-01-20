package com.company;

import java.time.LocalDateTime;

public class Perro {
    private boolean enAdopcion;
    private String raza;
    private int anioNacimiento;
    private double peso;
    private boolean chip;
    private boolean lastimado;
    private String nombre;

    public Perro (String nombre, String raza, int anioNacimiento){
        this.nombre=nombre;
        this.raza=raza;
        this.anioNacimiento=anioNacimiento;
        this.enAdopcion=false;
        this.peso=0.0;
        this.chip=false;
        this.lastimado=false;
    }
    public Perro (String nombre, String raza){
        this.nombre=nombre;
        this.raza=raza;
        this.anioNacimiento=2021;
        this.enAdopcion=false;
        this.peso=0.0;
        this.chip=false;
        this.lastimado=false;
    }

    public int getEdad(){
        int edad=(LocalDateTime.now().getYear()-this.anioNacimiento);
        return edad;
    }

    public boolean sePierde(){
        return !this.chip;
    }
    public void enviarAdopcion(){
        if (this.peso>5.0 && !this.lastimado){
            this.enAdopcion=true;
        }
    }

    public void setPeso(double peso){
        this.peso=peso;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public void estado(){
        System.out.println(this.nombre +" es un perro "+this.raza+" y pesa "+this.peso+"kg. En adopcion:"+this.enAdopcion+". Chip:"+this.chip);
    }
}
