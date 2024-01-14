public class ThreadAssignment1 {
    private static int[] arr = {1, 20, 50, 15, 30};
    private static double average;

    public static void main(String[] args) {
        // Creating two threads
        Thread averageThread = new Thread(() -> calculateAverage());
        Thread squareThread = new Thread(() -> printSquare());

        // Starting the threads
        averageThread.start();
        squareThread.start();

        try {
            // Waiting for both threads to finish
            averageThread.join();
            squareThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void calculateAverage() {
        synchronized (ThreadAssignment1.class) {
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
            }
            average = (double) sum / 10;
            System.out.println("Average: " + average);

            // Notify the other thread to proceed
            ThreadAssignment1.class.notify();

            try {
                // Give some time for the other thread to start
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void printSquare() {
        synchronized (ThreadAssignment1.class) {
            try {
                // Wait for the notification from the first thread
                ThreadAssignment1.class.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Squares of numbers:");
            for (int num : arr) {
                System.out.println(num + " squared is: " + num * num);
            }
        }
    }
}
