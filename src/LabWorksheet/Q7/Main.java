package LabWorksheet.Q7;

public class Main {
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();

        System.out.println("Thread 1 name: "+t1.getName());
        System.out.println("Thread 2 name: "+t2.getName());

        t1.setName("Thread One");
        t2.setName("Thread Two");

        System.out.println("Thread 1 name: "+t1.getName());
        System.out.println("Thread 2 name: "+t2.getName());

        t1.start();
        t2.start();

        System.out.println("Thread 1 name: "+t1.getName());
        System.out.println("Thread 2 name: "+t2.getName());
    }
}
