package com.company;

public class Main {

    public static void main(String[] args) {

        try{
            Personaje mayra=new Personaje("Mayra");
            Personaje ale=new Personaje("Ale");

            Habilidad disparar=HabilidadFactory.getInstance().nuevaHabilidad("Simple");
            Habilidad volar=HabilidadFactory.getInstance().nuevaHabilidad("Simple");
            Habilidad saltar=HabilidadFactory.getInstance().nuevaHabilidad("Simple");
            Habilidad volarYDisparar=HabilidadFactory.getInstance().nuevaHabilidad("Combinada");
            Habilidad disparoAlSaltar=HabilidadFactory.getInstance().nuevaHabilidad("Combinada");
            ((HabilidadSimple)disparar).setDatos("Disparar","Disparar",10.0);
            ((HabilidadSimple)saltar).setDatos("Saltar","Saltar",7.5);
            ((HabilidadCombinada)disparoAlSaltar).setDatos("Disparo-al-saltar","Dispara y salta en simultaneo",3);
            ((HabilidadCombinada)disparoAlSaltar).addHabilidad(disparar);
            ((HabilidadCombinada)disparoAlSaltar).addHabilidad(saltar);
            mayra.agregar(disparar);
            mayra.agregar(saltar);
            mayra.agregar(disparoAlSaltar);
            saltar.toString();
            mayra.mostrarHabilidades();
            Habilidad correr=HabilidadFactory.getInstance().nuevaHabilidad("Correr");

    }
    catch (Exception e){
        System.err.println("ERROR: "+e.getMessage());
    }

    }
}
