package org.example;

import org.example.exercises.class93.Pessoa;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println("Quantas pessoa serão analisadas?: ");
        n = scanner.nextInt();


        Pessoa[] pessoas = new Pessoa[n];

        for(int i = 0; i<pessoas.length; i++) {
            System.out.println("Digite o nome, idade e altura da pessoa" + (1 + i));
            String name = scanner.next();

            int idade = scanner.nextInt();

            Double altura = scanner.nextDouble();
            scanner.nextLine();

            pessoas[i] = new Pessoa(name, idade, altura);
        }
        System.out.println("Nome das pessoas");
        for(Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }

        System.out.println("Media da altura das pessoas");
        double sum = 0.0;
        for(Pessoa pessoa : pessoas){
            Double altura = pessoa.getAltura();

            sum += altura;

        }
        Double avg = sum / pessoas.length;

        System.out.println(avg);

        System.out.println("Pessoas com menos de 30 anos:");
        for(Pessoa pessoa : pessoas){
            int idadePessoa = pessoa.getIdade();

            if (idadePessoa < 30){
                String nomePessoa = pessoa.getNome();
                System.out.println(nomePessoa);
            }

        }



    }
}