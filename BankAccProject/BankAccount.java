package com.mycompany.project1;

import java.util.Scanner;

public class BankAccount {

    private String name;
    private String id;
    private double balance;
    private double lastTransaction;
    
    public BankAccount(){}
    public BankAccount(String name, String id, double balance) {
        setName(name);
        setId(id);
        setBalance(balance);
    }

    public void setName(String name) {
        // first do some validations on the name to make sure the name is valid.
        this.name = name;
    }

    public void setId(String id) {
        // do some validations on the id to make sure that the id is valid.
        this.id = id;
    }

    public void setBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
        }
    }

    private boolean validDeposite(double amount) {
        if (amount <= 0) {
            System.out.println("You must deposite a positive amount of money");
            return false;
        }
        return true;
    }

    private boolean validWithdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Your current balance " + balance);
            System.out.println("Invalid Transaction");
            return false;
        }
        return true;
    }

    public void deposite(double amount) {
        if (validDeposite(amount)) {
            balance += amount;
            lastTransaction = amount;
        }
    }

    public void withdraw(double amount) {
        if (validWithdraw(amount)) {
            balance -= amount;
            lastTransaction = amount * -1;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void getLastTransaction() {
        if (lastTransaction > 0) {
            System.out.println("Last transaction is Deposite and the deposited value = " + lastTransaction);
        } else {
            System.out.println("Last transaction is Withdraw and the value = " + Math.abs(lastTransaction));
        }
    }
}
