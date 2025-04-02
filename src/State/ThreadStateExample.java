package State;

public class ThreadStateExample {
    public static void main(String[] args) throws InterruptedException {
        // Create a thread
        Thread thread = new Thread(() -> {
            System.out.println("Thread started: " + Thread.currentThread().getState()); // Print state on start
            // Simulate some work (sleeping for 1 second)
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread after sleep: " + Thread.currentThread().getState()); // Print state after sleep
        });

        // Print initial state before starting the thread
        System.out.println("Thread state before start: " + thread.getState());

        // Start the thread
        thread.start();

        // Wait for the thread to finish (optional, just for demonstration)
        thread.join();

        // Print state after the thread finishes
        System.out.println("Thread state after join: " + thread.getState());
    }
}
