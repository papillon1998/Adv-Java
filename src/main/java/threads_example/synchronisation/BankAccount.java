package threads_example.synchronisation;

public class BankAccount {
    private int balance;
    private final int overdraft;

    public BankAccount(int overdraft) {
        this.overdraft = overdraft;
    }

    public void topUp(int amount) {
        balance += amount;
    }

    public void debit(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public int getOverdraft() {
        return overdraft;
    }
}
