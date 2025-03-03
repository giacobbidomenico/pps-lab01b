package e1;

public class SilverBankAccount extends BankAccountDecorator implements BankAccount {

    public SilverBankAccount(BankAccount bankAccount) {
        super(bankAccount);
    }

    public void withdraw(int amount) {
        if (this.getBalance() < amount){
            throw new IllegalStateException();
        }
        super.withdraw(amount + 1);
    }
}
