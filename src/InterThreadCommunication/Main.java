package InterThreadCommunication;

public class Main {
    public static void main(String[] args) {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        //start the thread
        p.t.start();
        c.t.start();

    }
}
