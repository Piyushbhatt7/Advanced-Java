public class Thread_Priority extends Thread {

    public static void main(String[] args) {
        
        Thread_Priority t1 = new Thread_Priority();
        Thread_Priority t2 = new Thread_Priority();
        
        t1.setPriority(MAX_PRIORITY);
        t2.setPriority(MIN_PRIORITY);

        System.out.println("Thread t11" + t1.getPriority());
        System.out.println("Thread t2 " + t2.getPriority());
    }
}