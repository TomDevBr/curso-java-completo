package org.example.exercises.class67;

import java.util.Scanner;

public class Products {
    public String name;
    public double price;
    public int quantity;

    private static final Scanner scanner = new Scanner(System.in);

    public double totalValueInStock () {
        return quantity * price;
    }

    public int addProducts(int quantity ) {
        return this.quantity += quantity;
    }

    public int removeProducts(int quantity) {
        return this.quantity -= quantity;
    }
}
