package InterThreadCommunication;

public class Q {
    int n;
    boolean valueset = false;
    synchronized int get() {
        while (!valueset)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught.");
            }
        System.out.println("Got: " + n);
        valueset = false;
        notify();
        return n;
    }

synchronized void put(int n) {
    while (valueset)
        try {
            wait();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught.");
        }
    this.n = n;
    valueset = true;
    System.out.println("Put: " + n);
    notify();
}
}

//package InterThreadCommunication;
//
//public class Q {
//    int n;
//
//    synchronized int get() {
//        System.out.println("Got: " + n);
//        return n;
//    }
//
//    synchronized void put(int n) {
//        this.n = n;
//        System.out.println("Put: " + n);
//    }
//
//}
//
