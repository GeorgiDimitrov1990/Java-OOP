package bank;

public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Deposit is invalid");
        }
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }
}
