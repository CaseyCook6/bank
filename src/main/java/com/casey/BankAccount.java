package com.casey;

import java.util.Random;

public class BankAccount {

    private double balance;
    private String nickname;
    private int accountNumber;

    public BankAccount() {
        this(0);
    }

    public BankAccount(double startingBalance) {
        this.balance = startingBalance;
        this.accountNumber = new Random().nextInt(999999) + 1000;
    }

    public boolean subtract(double amount) {
        if (balance - amount > 0) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean add(double amount) {
        balance += amount;
        return true;
    }


}
