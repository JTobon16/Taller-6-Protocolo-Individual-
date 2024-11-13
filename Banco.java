/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller6;

/**
 *
 * @author altoc
 */
public class Banco {
    
    private double saldo;

    // Constructor
    public Banco(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            throw new IllegalArgumentException("Saldo inicial no puede ser negativo");
        }
    }

    
    public double obtenerSaldo() {
        return saldo;
    }

  
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("El monto de depósito debe ser positivo.");
        }
    }

 
    public void retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
        } else if (monto <= 0) {
            System.out.println("El monto de retiro debe ser positivo.");
        } else {
            System.out.println("Saldo insuficiente para el retiro.");
        }
    }
}
