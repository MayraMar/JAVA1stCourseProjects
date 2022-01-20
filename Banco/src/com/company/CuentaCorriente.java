package com.company;

import java.util.Date;

public class CuentaCorriente extends Cuenta{
    private Double montoDescubierto;

    public CuentaCorriente(Cliente titular, Double saldo, Double montoDescubierto) {
        super(titular, saldo);
        this.montoDescubierto = montoDescubierto;
    }


    public void depositarCheque(Double monto, String bancoEmisor){
        this.setSaldo(this.getSaldo()+monto);

    }
    @Override
    public void extraerEfectivo(Double monto) {
        if (monto<this.montoDescubierto+this.getSaldo()){
            this.setSaldo(this.getSaldo()-monto);
        }
    }
}
