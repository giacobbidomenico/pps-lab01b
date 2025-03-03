package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GoldBankAccountTest extends BankAccountTest{
    @Override
    @BeforeEach
    protected void init() {
        this.account = new GoldBankAccount(new CoreBankAccount());
    }

    @Test
    public void testCanWithdraw() {
        this.account.deposit(1000);
        this.account.withdraw(200);
        assertEquals(800, this.account.getBalance());
    }

    @Test
    public void testAllowOverdraft() {
        this.account.deposit(1000);
        this.account.withdraw(1500);
        assertEquals(-500, this.account.getBalance());
        assertThrows(IllegalStateException.class, () -> this.account.withdraw(1));
    }

}
