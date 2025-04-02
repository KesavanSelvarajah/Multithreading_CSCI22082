package sync;

public class Sync {
    public static void main(String[] args) {
        CallMe target = new CallMe();
        Caller obj1 = new Caller(target, "Hello");
        Caller obj2 = new Caller(target, "Synchronized");
        Caller obj3 = new Caller(target, "World");

        //start the threads
        obj1.t.start();
        obj2.t.start();
        obj3.t.start();

        //wait for threads to end
        try {
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException e) {
            System.out.print("Interrupted");
        }
    }
}
