package LabWorksheet.Q7;

public class ThreadOne extends Thread{
    @Override
    public void run() {
        System.out.println(getName()+" Started");
    }
}
