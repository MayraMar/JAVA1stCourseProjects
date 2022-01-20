package com.company;

public class Main {

    public static void main(String[] args) {
	    Puerto buenosAires= new Puerto("Buenos Aires");
        Contenedor manzanas=new Contenedor(1234,"EEUU",false);
        Contenedor veneno=new Contenedor(19234,"Desconocida",true);
        Contenedor compus=new Contenedor(134,"China",false);

        buenosAires.addContenedor(manzanas);
        buenosAires.addContenedor(veneno);
        buenosAires.addContenedor(compus);

        buenosAires.getContenedores().sort(null);
        System.out.println(buenosAires.getContenedores());

        int cantPeligrosos=0;
        for (Contenedor contenedor: buenosAires.getContenedores()) {

            if(contenedor.getPaisProcedencia()=="Desconocida" && contenedor.getMaterialesPeligrosos()){
                cantPeligrosos++;
            }

        }
        System.out.println(cantPeligrosos);
    }
}
