package Lab6;

public class Thread1 extends Thread{
    public void run(){
        for (int i = 1; i <= 20; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
