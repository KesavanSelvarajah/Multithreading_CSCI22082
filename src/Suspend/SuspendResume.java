package Suspend;

public class SuspendResume {
    public static void main(String[] args) {
        NewThread obj1 = new NewThread("one");
        NewThread obj2 = new NewThread("Two");
        obj1.t.start();
        obj2.t.start();
        try {
            Thread.sleep(1000);
            obj1.mysuspend();
            System.out.println("Suspending thread One");
            Thread.sleep(1000);
            obj1.myresume();
            System.out.println("Resuming thread One");
            obj2.mysuspend();
            System.out.println("Suspending thread Two");
            Thread.sleep(1000);
            obj2.myresume();
            System.out.println("Resuming thread Two");
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        //wait for threads to finish
        try {
            System.out.println("Waiting for threads to finish");
            obj1.t.join();
            obj2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting");
    }
}
