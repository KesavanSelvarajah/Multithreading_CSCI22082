package LabWorksheet.Q1;

public class Q1 implements Runnable{
    Thread thread;

    public Q1() {
        thread = new Thread(this);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Thread is running");
    }
}
