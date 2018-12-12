package com.simba.simba;

public class BankAccount {
    private String name;
    private double balance;
    private String animalType;
    private boolean king;
    private int badGuy;

    public BankAccount(String name, double balance, String animalType, boolean king, int badGuy) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.king = king;
        this.badGuy = badGuy;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public boolean isKing() {
        return king;
    }

    public int getBadGuy() {
        return badGuy;
    }
}
