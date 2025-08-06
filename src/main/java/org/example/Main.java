package org.example;

import org.example.class73.DolarToReais;
import org.example.exercises.class67.Products;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor atual  da cotação do dolar:");
        DolarToReais.currentDolarPrice = scanner.nextDouble();

        System.out.println("Digite o valor em dolar que quer converter:");
        DolarToReais.valueDolarToConvert = scanner.nextDouble();

        double value = DolarToReais.convertDolarToReais();
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        System.out.println("O valor em reais é: " + numberFormat.format(value));

    }
}