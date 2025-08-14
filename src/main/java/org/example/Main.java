package org.example;

import org.example.class73.DolarToReais;
import org.example.exercises.class82.CadastroBanco;
import org.example.exercises.class82.DepositoOuSaque;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        CadastroBanco cadastroBanco = new CadastroBanco();
        DepositoOuSaque depositoOuSaque = new DepositoOuSaque();

        System.out.println("Digite o numero da conta:");
        int numeroDaConta = scanner.nextInt();
        scanner.nextLine();
        cadastroBanco.setNumeroDaConta(numeroDaConta);

        System.out.println("Digite o nome do titular:");
        String titularDaConta = scanner.nextLine();
        cadastroBanco.setNomeDoTitular(titularDaConta);

        String temDeposito;
        boolean temDepositoBool;

        do {
            System.out.println("Deseja fazer um depósito inicial (S/N)?:");
            temDeposito = scanner.nextLine().trim(); // remove espaços extras

            if (temDeposito.equalsIgnoreCase("S")) {
                temDepositoBool = true;
                break; // sai do loop
            } else if (temDeposito.equalsIgnoreCase("N")) {
                temDepositoBool = false;
                break; // sai do loop
            } else {
                System.out.println("Entrada inválida! Digite apenas 'S' ou 'N'.");
            }
        } while (true);

        if(temDepositoBool) {
            System.out.println("Digite o valor do deposio '0.00'");
            double depositoInicial = scanner.nextDouble();
            cadastroBanco.temDepositoInicial(depositoInicial);
        } else {
            cadastroBanco.temDepositoInicial();
        };

        System.out.println("Dados da conta:");
        System.out.println("conta: " + cadastroBanco.getNumeroDaConta()
                                     + " Titular: " + cadastroBanco.getNomeDoTitular()
                                     + " Balanço: " + cadastroBanco.getDepositoInicial());

        String novoDeposito;
        boolean novoDepositoBool;
        do {
            System.out.println("Deseja fazer um depósito (S/N)?:");
            novoDeposito = scanner.nextLine().trim(); // remove espaços extras

            if (novoDeposito.equalsIgnoreCase("S")) {
                novoDepositoBool = true;
                break; // sai do loop
            } else if (novoDeposito.equalsIgnoreCase("N")) {
                novoDepositoBool = false;
                break; // sai do loop
            } else {
                System.out.println("Entrada inválida! Digite apenas 'S' ou 'N'.");
            }
        } while (true);

        if(novoDepositoBool) {
            System.out.println("Digite o valor do deposio '0.00'");
            double deposito = scanner.nextDouble();
            double valorAtual = depositoOuSaque.deposito(deposito, cadastroBanco.getDepositoInicial());

            System.out.println("Dados da conta:");
            System.out.println("conta: " + cadastroBanco.getNumeroDaConta()
                    + " Titular: " + cadastroBanco.getNomeDoTitular()
                    + " Balanço: " + valorAtual);
        } else {
            return;
        };



    }
}