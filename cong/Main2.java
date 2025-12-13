package cong;

import java.util.*;

class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    // Corrected: balance should be double
    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountStatus() {
        if (balance == 0) {
            return "Zero Balance";
        } else if (balance < 1000) {
            return "Low Balance";
        } else {
            return "Active";
        }
    }
}

public class Main2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number:");
        int accountNumber = sc.nextInt();
        sc.nextLine(); // FIX: clear extra newline

        System.out.println("Enter Account Holder Name:");
        String holderName = sc.nextLine();

        System.out.println("Enter Initial Balance:");
        double balance = sc.nextDouble();

        BankAccount b1 = new BankAccount(accountNumber, holderName, balance);

        System.out.println("\nAccount Status: " + b1.getAccountStatus());
        System.out.println("Balance: " + b1.getBalance());
    }
}
    