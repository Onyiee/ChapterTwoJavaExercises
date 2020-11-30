package com.firstTdd.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account myAccount;
    @BeforeEach
    void setUp() {
        myAccount = new Account();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testMoneyCanBeDeposited(){
        myAccount.deposit(1000);
        int balance = myAccount.getBalance();
        assertEquals(1000,balance);
        myAccount.deposit(1000);
        balance = myAccount.getBalance();
        assertEquals(2000, balance);
    }

    @Test
    void testNegativeAmountCantBeDeposited(){
        myAccount.deposit(1000);
        myAccount.deposit(-200);
        int balance = myAccount.getBalance();
        assertEquals(1000, balance);
    }
}