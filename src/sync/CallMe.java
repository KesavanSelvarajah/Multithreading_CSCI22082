package sync;

class CallMe {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000); // Simulate some work
        } catch (InterruptedException e) {
            System.out.print("Interrupted");
        }
        System.out.print("]");
    }
}

