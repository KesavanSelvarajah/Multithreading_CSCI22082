package LabWorksheet.Q6;

public class Main {
    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();
        SecondThread secondThread = new SecondThread();
        firstThread.start();
        if(firstThread.isAlive()){
            try {
                firstThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        secondThread.start();
    }
}
