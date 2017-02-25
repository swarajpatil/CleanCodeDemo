package main.java.GetterSetter;

public class Account {

    private String name;
    private String type;
    private Integer accountNumber;
    private double balance;

    public Account(String name, String type, Integer accountNumber) {
        this.name = name;
        this.type = type;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
