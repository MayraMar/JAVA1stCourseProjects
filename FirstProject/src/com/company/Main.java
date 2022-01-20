package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner lector;
        lector= new Scanner(System.in);
        int edad;
        String nombre;
        char inicial;
        System.out.println("Ingrese su edad");
        edad=lector.nextInt();
        System.out.println("Ingrese su nombre");
        nombre=lector.next();
        inicial=nombre.charAt(0);

        System.out.println(nombre+ " Tienes "+edad+"años. Te llamaré " + inicial);

    }
}
