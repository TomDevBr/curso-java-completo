package org.example;

import org.example.exercises.class67.Products;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Products product = new Products();
        System.out.println("Digite os dados do produtod:");
        System.out.println("Digite o nome:");
        product.name = scanner.nextLine();
        System.out.println("Digite o valor:");
        product.price =  scanner.nextDouble();
        System.out.println("Digite a quantidade");
        product.quantity = scanner.nextInt();

        System.out.println(product.name + ", " +  product.price + ", " + product.quantity);
    }
}