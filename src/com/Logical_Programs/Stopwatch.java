import java.util.Scanner;

public class Stopwatch {
    private long startTime;
    private long endTime;

    // Start the stopwatch
    public void start() {
        startTime = System.currentTimeMillis();
        System.out.println("Stopwatch started. Press Enter to stop.");
        new Scanner(System.in).nextLine(); // Wait for user to press Enter
    }

    // Stop the stopwatch
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    // Get the elapsed time in milliseconds
    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();

        System.out.println("Press Enter to start the stopwatch.");
        new Scanner(System.in).nextLine(); // Wait for user to press Enter
        stopwatch.start();

        System.out.println("Press Enter to stop the stopwatch.");
        new Scanner(System.in).nextLine(); // Wait for user to press Enter
        stopwatch.stop();

        long elapsedTime = stopwatch.getElapsedTime();
        System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");
    }
}
