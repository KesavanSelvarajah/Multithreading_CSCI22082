package LabWorksheet.Q8;

public class Main {
    public static void main(String[] args) {
        LowPriorityThread lowPriorityThread = new LowPriorityThread(Thread.MIN_PRIORITY);
        HighPriorityThread highPriorityThread = new HighPriorityThread(Thread.MAX_PRIORITY);
        NormalPriorityThread normalPriorityThread = new NormalPriorityThread();

        System.out.println("Name: "+lowPriorityThread.getName());
        System.out.println("Priority: "+lowPriorityThread.getPriority());

        System.out.println("Name: "+highPriorityThread.getName());
        System.out.println("Priority: "+highPriorityThread.getPriority());

        System.out.println("Name: "+normalPriorityThread.getName());
        System.out.println("Priority: "+normalPriorityThread.getPriority());

        lowPriorityThread.start();
        highPriorityThread.start();
        normalPriorityThread.start();
    }
}
