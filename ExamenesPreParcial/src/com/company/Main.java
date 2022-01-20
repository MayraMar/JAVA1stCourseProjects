package com.company;

public class Main {

    public static void main(String[] args) {
        Alumno mayra = new Alumno(8787, "Mayra", "Martinez");
        ExamenParcial parcialUno = new ExamenParcial("JAVA", "Ver odf Adjunto", 10.0, mayra, 1);

        System.out.println(parcialUno.puedeRecuperar());

        parcialUno.setReintentos(3);
        System.out.println(parcialUno.puedeRecuperar());
        parcialUno.setReintentos(4);
        System.out.println(parcialUno.puedeRecuperar());
        ExamenParcial parcialUnidCuatro = new ExamenParcial("Unidad 4", "adjunto", 6.0, mayra, 4);
        System.out.println(parcialUnidCuatro.puedeRecuperar());

        parcialUnidCuatro.setReintentos(2);
        System.out.println(parcialUnidCuatro.puedeRecuperar());
        parcialUnidCuatro.setReintentos(3);
        System.out.println(parcialUnidCuatro.puedeRecuperar());

        ExamenFinal finalMayra = new ExamenFinal("JAVA", "lalaland", 10.0, mayra, "Herencia");
        finalMayra.setNotaOral(4.0);
        System.out.println(finalMayra.getPromedio());

        ExamenFinal finalTestin = new ExamenFinal("testin", "probar", 8.0, mayra, "testing no funcional");
        finalTestin.setNotaOral(8.0);
        System.out.println(finalTestin.getPromedio());
        System.out.println(finalTestin.compareTo(finalMayra));
        if (finalTestin.compareTo(finalMayra) > 0) {
            System.out.println("A Mayra le fue mejor en Testing que en JAVA");
        } else if (finalTestin.compareTo(finalMayra) == 0) {
            System.out.println("Saco igual nota");
        }
    }
}
