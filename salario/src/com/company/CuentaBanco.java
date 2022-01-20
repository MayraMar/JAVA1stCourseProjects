package com.company;

public class CuentaBanco {

    private int numeroDeCuenta;
    private Double saldo;

    public CuentaBanco(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo=0.0;
    }

    public CuentaBanco (int numeroCuenta, Double saldoInicial){
        numeroDeCuenta=numeroCuenta;
        saldo=saldoInicial;
    }

    public void deposito(Double deposito){
        this.saldo+=deposito;
        }

        public void extraccion(Double montoExtraccion){
            if(montoExtraccion<saldo) {
                this.saldo=this.saldo-montoExtraccion;
            }
        }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public void setSaldo(Double saldo) {
            this.saldo = saldo;
        }

        public Double getSaldo() {
            return saldo;
        }
}
