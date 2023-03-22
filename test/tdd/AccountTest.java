package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    public void depositMoneyTest(){
        //given
        Account adeyemiAccount = new Account();


        //when

        adeyemiAccount.deposit(2_000);

        //assert
        int balance = adeyemiAccount.getBalance();
        assertEquals(2000, balance);
    }

}