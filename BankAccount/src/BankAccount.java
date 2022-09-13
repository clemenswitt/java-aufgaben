public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public double payIn(double amount) {
        this.balance += amount;
        return getBalance();
    }

    public double payOff(double amount) {
        if(amount < balance) balance -= amount;
        return getBalance();
    }
}
