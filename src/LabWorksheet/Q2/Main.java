package LabWorksheet.Q2;

public class Main {
    public static void main(String[] args) {
        Q2 thread = new Q2();
        System.out.println("Thread name: "+thread.getName());
        System.out.println("Thread priority: "+thread.getPriority());
        System.out.println("Before start: "+thread.isAlive());
        thread.start();
        System.out.println("After start: "+thread.isAlive());

    }
}
