package Exception;
//To run a program 10 times and then terminate, you can use a static counter and a condition to exit the program after the 10th run.
public class practice {
    private static int runCount = 0;
    private static final int MAX_RUNS = 10;

    public static void main(String[] args) {
        while (runCount < MAX_RUNS) {
            runProgram();
            runCount++;
        }
        System.out.println("Program terminated after " + MAX_RUNS + " runs.");
    }
    public static void runProgram() {
        System.out.println("count: " + runCount);
    }
}
