package july_26;

public class Test {
    public static void main(String[] args) {
        try {
            MyThread mt = new MyThread();
            mt.start();

            synchronized (mt) { // Getting the lock of mt object
                System.out.println("main thread calls the wait method");
                mt.wait(); // Wait until notified
                System.out.println("main thread got the notification");
                System.out.println("Value of num: " + mt.num);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
    }
}
