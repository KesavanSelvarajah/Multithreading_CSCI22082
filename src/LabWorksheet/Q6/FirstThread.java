package LabWorksheet.Q6;

public class FirstThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is running");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" is exiting");
    }
}

