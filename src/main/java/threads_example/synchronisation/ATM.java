package threads_example.synchronisation;

public class ATM {

//    Synchronized method is used to lock an object for any shared resource
    public static  void withdraw(BankAccount account, int ammount) {
        int allowance = account.getOverdraft()*-1;
        int balance = account.getBalance();
        if (balance - ammount < allowance) {
            System.out.println("Transaction denied!");
        }else {
            account.debit(ammount);
            System.out.println("$" + ammount + " withdrawn.");
        }

        System.out.println("Current Balance: " + account.getBalance());
    }

}
