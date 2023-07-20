package threads_example;

public class RunnableEx implements Runnable {


    @Override
    public void run() {
        for (int i=0; i<=5; i++){
            System.out.println(i+ " " + Thread.currentThread().getName());
        }
    }
}
