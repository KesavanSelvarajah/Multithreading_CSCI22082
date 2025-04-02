package LabWorksheet.Q6;

public class SecondThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
        System.out.println(Thread.currentThread().getName()+" is exiting");
    }
}
