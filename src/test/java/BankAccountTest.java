import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankAccountTest {

    public BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount("Colin", 400);
    }

    @Test
    void testIniBal() {
        assertEquals(400, account.getBalance());
    }

    @Test
    void testDeposit() {
        account.deposit(5.0);
        assertEquals(405, account.getBalance());
    }

    @Test
    void testWithdraw() {
        account.withdraw(200);
        assertEquals(200, account.getBalance());
    }

    @Test
    void testStringMethod() {
        String result = account.toString();

        assertTrue(result.contains(account.getAccountHolder()));
        assertTrue(result.contains(String.valueOf(account.getBalance())));
        System.out.println(account.toString());
    }
}
