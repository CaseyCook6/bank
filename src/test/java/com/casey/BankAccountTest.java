package com.casey;

import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    public void shouldSubtractAmount() {
        BankAccount bankAccount = new BankAccount(15.00);
        bankAccount.subtract(7.00);
        
    }

}
