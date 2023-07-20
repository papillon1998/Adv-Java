package threads_example.synchronisation;

public class Users {

    static final BankAccount account = new BankAccount(0);

    public static void main(String[] args) {
        account.topUp(100);

        Thread thread1 = new Thread(() -> {
            ATM.withdraw(account, 100);
        });

        Thread thread2 = new Thread(() -> {
            ATM.withdraw(account, 100);
        });

        thread1.start();
        thread2.start();
    }


}
