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
            System.out.println("Thread 1 is running");
        }
    }
}


public class ThreadPriorities {
    
    public static void main(String[] args) {
        
        // Ready Queue : T1 T2 T3 T4 T5
        MyThread t1 = new MyThread("Harry");
        MyThread t2 = new MyThread("Harry");
        MyThread t3 = new MyThread("Harry");
        MyThread t4 = new MyThread("Harry");
        MyThread t5 = new MyThread("Harry");
    }
}
