package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner lector= new Scanner(System.in);
        String jugador1;
        String jugador2;
        int puntos1=0;
        int puntos2=0;

        System.out.println("Ingrese el nombre del primer jugador:");
        jugador1=lector.nextLine();
        System.out.println("Ingrese el nombre del segundo jugador:");
        jugador2=lector.nextLine();
        String jugada1="";
        String jugada2="";
        while (!jugada1.equals("*")) {
            System.out.println(jugador1 + " ingrese su jugada (piedra/papel/tijera/*para salir):");
            jugada1 = lector.nextLine();
            System.out.println(jugador2 + " ingrese su jugada (piedra/papel/tijera):");
            jugada2 = lector.nextLine();
            int resultado= cualGana(jugada1,jugada2);
            if (resultado==1) {puntos1+=1;
            } else if (resultado==2) {
                puntos2 += 1;
            }
            System.out.println("puntaje parcial: "+jugador1+":"+puntos1+" puntos, "+jugador2+": "+puntos2+" puntos");
        }
        System.out.println("Juego finalizado. El jugador 1 tiene "+ puntos1 + " puntos y el jugador 2 tiene "+ puntos2+" puntos");
        //jugada de cada uno con lector -- si es * termina el juego
        //funcion que determina ganador
        // sumarle un punto al ganador
    }

        public static int cualGana(String jugada1, String jugada2) {
            if (jugada1 == "*") {
                return 3;
            }
            if (jugada1.equals(jugada2)) {
                return 0;
            }
            if ((jugada2.equals("papel") && jugada1.equals("piedra") )|| (jugada2.equals("piedra") && jugada1.equals("tijera")) || (jugada2.equals("tijera") && jugada1.equals("papel"))) {
                return 2;
            }
             else  {
                return 1;
            }

        }

}
