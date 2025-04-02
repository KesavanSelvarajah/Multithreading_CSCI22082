package NamePriority;

// Create a second thread.
class NewThread implements Runnable {
    String name; //name of the tread
    Thread t;
    //constructor
    NewThread(String threadname) {
        name = threadname;
        // Create a new, second thread
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
    }
    // This is the entry point for the second thread.
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "Interrupted.");
        }
        System.out.println(name + "Exiting.");
    }
}
