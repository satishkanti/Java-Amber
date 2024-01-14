public class RaceSimulation {
    public static void main(String[] args) {
        // Create three threads
        Thread runner1 = new Thread(new Runner("Runner 1"));
        Thread runner2 = new Thread(new Runner("Runner 2"));
        Thread runner3 = new Thread(new Runner("Runner 3"));

        // Set different priorities for each thread
        runner1.setPriority(Thread.MIN_PRIORITY);
        runner2.setPriority(Thread.NORM_PRIORITY);
        runner3.setPriority(Thread.MAX_PRIORITY);

        // Start the threads
        runner1.start();
        runner2.start();
        runner3.start();
    }
}

class Runner implements Runnable {
    private final String name;

    public Runner(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " - Iteration: " + i);

            try {
                // Introduce a delay between iterations
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
