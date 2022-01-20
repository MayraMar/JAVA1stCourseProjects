package com.company;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Main {

    public static void main(String[] args) {
	    int valorHora=875;// write your code here
        double salario;
        int horasTrabajadas;
        int horasExtras;
        int horasMaximasSemanales=40;
        Scanner lector=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas trabajadas esta semana: ");
        horasTrabajadas=lector.nextInt();
        if (horasTrabajadas<=horasMaximasSemanales){
            salario=valorHora*horasTrabajadas;
        } else {
            horasExtras=horasTrabajadas-horasMaximasSemanales;
            salario=horasMaximasSemanales*valorHora+horasExtras*valorHora*1.5;
        }
        System.out.println("Tu sueldo semanal será de $"+salario);

        CuentaBanco cuentaMayra= new CuentaBanco(123456, 250.0);
        cuentaMayra.deposito(250.0);
        System.out.println(cuentaMayra.getSaldo());
        System.out.println(cuentaMayra.getNumeroDeCuenta());

        // probando los dos constructores
        CuentaBanco cuentaSinSaldo= new CuentaBanco(2020);
        System.out.println(cuentaSinSaldo.getSaldo());
        CuentaBanco cuentaCompleta= new CuentaBanco(666, 300.0);
        System.out.println(cuentaCompleta.getSaldo());
    }
}
