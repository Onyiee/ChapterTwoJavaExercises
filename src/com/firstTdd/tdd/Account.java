package com.firstTdd.tdd;

public class Account {
    private int accountBalance;
    public void deposit(int depositAmount) {
        if(depositAmount > 0) {
            accountBalance += depositAmount;
        }

    }

    public int getBalance() {
        return accountBalance;
    }
}
