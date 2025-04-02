package LabWorksheet.Q8;

public class HighPriorityThread extends Thread{

    public HighPriorityThread(int priority) {
        this.setPriority(priority);
    }

    @Override
    public void run() {
        for(int i=0; i<3; i++){
            System.out.println("Name: "+Thread.currentThread().getName());
            System.out.println("Priority: "+Thread.currentThread().getPriority());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
