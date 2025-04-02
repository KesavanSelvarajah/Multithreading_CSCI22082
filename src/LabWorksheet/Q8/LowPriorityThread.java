package LabWorksheet.Q8;

public class LowPriorityThread extends Thread{

    public LowPriorityThread(int priority) {
        this.setPriority(priority);
    }

    public void run(){
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
