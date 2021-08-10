package bank;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {
    @Test
    public void testBankAccountCreationStartsWithZeroBalance(){
        BankAccount bankAccount = new BankAccount();

        double balance = bankAccount.getBalance();

        assertEquals(0, balance, 0 );

    }

    @Test
    public void  testDepositShouldIncreaseAmountCorrectly(){
        //3A principe
        //Arrange
        BankAccount bankAccount = new BankAccount();
        //Act
        bankAccount.deposit(300);
        //Assert
        assertEquals(300, bankAccount.getBalance(), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDepositWithNegativeAmount(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(-300);
    }
}
