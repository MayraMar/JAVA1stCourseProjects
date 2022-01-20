package com.company;

public class Main {

    public static void main(String[] args) {
	CuentaCorriente cuentaMay=new CuentaCorriente(new Cliente("Martinez",1234,32953,27328),1000.0,500.0);
        System.out.println(cuentaMay.getSaldo());
        cuentaMay.depositarCheque(500.0,"Santander");
        System.out.println(cuentaMay.getSaldo());
        cuentaMay.extraerEfectivo(3000.0);
        System.out.println(cuentaMay.getSaldo());
        cuentaMay.extraerEfectivo(1800.0);
        System.out.println(cuentaMay.getSaldo());
    }
}
