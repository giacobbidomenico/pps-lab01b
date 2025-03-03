package e1;

public class BronzeBankAccount extends BankAccountDecorator implements BankAccount {

    protected BronzeBankAccount(BankAccount bankAccount) {
        super(bankAccount);
    }

    public void withdraw(int amount) {
        if (this.getBalance() < amount){
            throw new IllegalStateException();
        }
        if (amount <= 100) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1);
        }
    }

}
