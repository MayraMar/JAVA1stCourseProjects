package com.company;

public abstract class Cuenta {
    private Cliente titular;
    private Double saldo;
    public Cuenta(Cliente titular, Double saldo){
        this.titular=titular;
        this.saldo=saldo;
    }
    public abstract void extraerEfectivo(Double monto);
    public Double informarSaldo(){
        return this.saldo;
    }
    public void depositar (Double monto){
        this.saldo+=monto;
    }
    public Double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(Double saldo){
        this.saldo=saldo;
    }
}
