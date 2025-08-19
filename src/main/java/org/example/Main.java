package org.example;

import org.example.class73.DolarToReais;
import org.example.exercises.class82.Account;
import org.example.exercises.class82.DepositoOuSaque;


import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Account account;

        System.out.println("Digite o numero da conta:");
        int numeroDaConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do titular:");
        String holder = scanner.nextLine();

        String temDeposito;
        boolean temDepositoBool;
        double depositoInicial;

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
            depositoInicial = scanner.nextDouble();
            account = new Account(numeroDaConta, holder, depositoInicial );
        } else {
            account = new Account(numeroDaConta, holder);
        };
        System.out.println("");
        System.out.println("Dados da conta:");
        System.out.println(account);
        scanner.nextLine();

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
            account.deposit(deposito);
            scanner.nextLine();

            System.out.println("Dados da conta:");
            System.out.println(account);
        } else {
            return;
        };

        String saque;
        boolean saqueBool;

        do {
            System.out.println("Deseja fazer um saque(S/N)?:");
            saque = scanner.nextLine().trim(); // remove espaços extras

            if (saque.equalsIgnoreCase("S")) {
                saqueBool = true;
                break; // sai do loop
            } else if (saque.equalsIgnoreCase("N")) {
                saqueBool = false;
                break; // sai do loop
            } else {
                System.out.println("Entrada inválida! Digite apenas 'S' ou 'N'.");
            }
        } while (true);


        if(saqueBool) {
            System.out.println("Digite o valor do saque '0.00'");
            double saqueValor = scanner.nextDouble();
            account.withDraw(saqueValor);
            scanner.nextLine();

            System.out.println("Dados da conta:");
            System.out.println(account);
        } else {
            return;
        };



    }
}