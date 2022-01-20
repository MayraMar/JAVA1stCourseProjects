package com.company;

public class Cliente {
    private String apellido;
    private Integer numeroCliente;
    private Integer dni;
    private Integer cuit;

    public Cliente(String apellido, Integer numeroCliente, Integer dni, Integer cuit) {
        this.apellido = apellido;
        this.numeroCliente = numeroCliente;
        this.dni = dni;
        this.cuit = cuit;
    }

}
