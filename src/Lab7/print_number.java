package Lab7;

// Class PrintNumber that extends Thread to create a new thread
public class print_number  extends Thread {

    @Override
    public void run() {
        // Loop to print numbers from 0 to 4
        for (int i = 0; i <= 4; i++) {
            // Print the current thread name and the number
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }

    public static void main(String[] args) {
        //main method
        print_number num = new print_number();
        num.start();
    }
}




