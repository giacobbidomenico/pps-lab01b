package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BronzeBankAccountTest extends BankAccountTest{
    @Override
    @BeforeEach
    protected void init() {
        this.account = new BronzeBankAccount(new CoreBankAccount());
    }

    @Test
    public void testFeeLimit() {
        this.account.deposit(1000);
        this.account.withdraw(100);
        assertEquals(900, this.account.getBalance());
        this.account.withdraw(101);
        assertEquals(798, this.account.getBalance());
    }
}
