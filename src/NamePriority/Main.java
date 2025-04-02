package NamePriority;

class Main {
    public static void main(String[] args) {
        NewThread nt1 = new NewThread("One");
        OldThread nt2 = new OldThread("Two");
        //start the threads.
        nt1.t.start();
        nt2.t.start();
        System.out.println("Priority " + nt1.name+ ": "+nt1.t.getPriority());
        System.out.println("Priority " + nt2.name+ ": "+nt2.t.getPriority());
        System.out.println("Setting priority");
        nt2.t.setPriority(Thread.MAX_PRIORITY);
        nt1.t.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Priority " + nt1.name+ ": "+nt1.t.getPriority());
        System.out.println("Priority " + nt2.name+ ": "+nt2.t.getPriority());

    }
}

