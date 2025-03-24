public class DeadlockDemo {

    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();


    public static void main(String[] args) {
        
        Thread t1 = new Thread(() -> {
            synchronized (lock1)
            {
                System.out.println("Thread1 Holding lock1");
            }
            try{Thread.sleep(100);}
            catch(InterruptedException e){}
            System.out.println("Thread 1 waiting for lock2");
            synchronized (lock2)
            {
                System.out.println("Thread 1 Aquired lock2");
            }
        });
    }
}
