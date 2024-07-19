package Exception;

public class practice2 {

        private static int runCount = 0;
        private static final int MAX_RUNS = 10;

        public static void main(String[] args) {
            for (int i = 0; i < MAX_RUNS; i++) {
                runProgram();
            }
            System.out.println("Program terminated after " + MAX_RUNS + " runs.");
        }

        public static void runProgram() {
            runCount++;
            System.out.println("Count: " + runCount);
        }
    }

