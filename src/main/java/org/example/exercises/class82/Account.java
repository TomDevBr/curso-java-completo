package org.example.exercises.class82;

public class Account {
    private int accountNumber;
    private String holder;
    private Double balance;


    public Account(int accountNumber, String holder) {
        this.accountNumber = accountNumber;
        this.holder = holder;
    }

    public Account(int accountNumber, String holder, Double initialDeposit) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getNomeDoTitular() {
        return holder;
    }

    public void setNomeDoTitular(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(double value){
        this.balance += value;
    }

    public void withDraw(double value){
        this.balance -= value + 5.0;
    }


}
