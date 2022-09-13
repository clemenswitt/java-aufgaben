import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {

    @Test
    public void checkInitialization() {
        BankAccount account = new BankAccount();
        assertEquals(0d, account.getBalance(), 0d);
    }

    @Test
    public void checkPayIn() {
        BankAccount account = new BankAccount();
        account.payIn(10);
        assertEquals(10, account.getBalance(), 0d);
    }

    @Test
    public void checkPayOff() {
        BankAccount account = new BankAccount();
        account.payIn(10);
        account.payOff(5);
        assertEquals(5, account.getBalance(), 0d);
    }

    @Test
    public void checkReturnValues() {
        BankAccount account = new BankAccount();
        assertEquals(10, account.payIn(10), 0d);
        assertEquals(5, account.payOff(5), 0d);
    }

    @Test
    public void CheckNoNegativeBalance() {
        BankAccount account = new BankAccount();
        account.payIn(10);
        account.payOff(11);
        assertEquals(10, account.getBalance(), 0d);
    }

}