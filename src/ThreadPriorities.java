class MyThread extends Thread {
    public MyThread(String name)
    {
        super(name);
    }

    public  void run()
    {
        int i = 0;
        while(i < 30)
        {
            System.out.println("Thread 1 is running " + getName());
            i++;
        }
    }
}


public class ThreadPriorities {
    
    public static void main(String[] args) {
        
        // Ready Queue : T1 T2 T3 T4 T5
        MyThread t1 = new MyThread("Harry");
        MyThread t2 = new MyThread("Don");
        MyThread t3 = new MyThread("Badmosh");
        MyThread t4 = new MyThread("Chintu (most Important)");
        MyThread t5 = new MyThread("Savan");
        
        t4.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
