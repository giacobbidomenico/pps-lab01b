package e1;

public class GoldBankAccount extends BankAccountDecorator implements BankAccount    {
    private static final double LIMIT_OVERDRAFT = -500;

    protected GoldBankAccount(BankAccount bankAccount) {
        super(bankAccount);
    }

    public void withdraw(int amount) {
        if((this.getBalance() - amount) < LIMIT_OVERDRAFT) {
            throw  new IllegalStateException();
        }
        super.withdraw(amount);
    }
}
