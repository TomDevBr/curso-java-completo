package org.example.exercises.class82;

public class DepositoOuSaque {
    private double valorAtual;

    public double deposito(double valorDeposito, double valorAtual){
        this.valorAtual = valorDeposito + valorAtual;
        return this.valorAtual;
    }

    public double saque(double valorSaque, double valorAtual){
        this.valorAtual = valorSaque + valorAtual;
        return this.valorAtual;
    }
}
