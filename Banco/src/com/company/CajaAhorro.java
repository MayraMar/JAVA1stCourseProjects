package com.company;

public class CajaAhorro extends Cuenta{
    private Double tasaInteres;

    public CajaAhorro(Cliente titular, Double saldo, Double tasaInteres) {
        super(titular, saldo);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void extraerEfectivo(Double monto) {
        if(monto<=this.getSaldo()){
            this.setSaldo(this.getSaldo()-monto);
        }
    }
}
