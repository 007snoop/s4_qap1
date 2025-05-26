import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
