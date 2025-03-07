class MyThread extends Thread {
    public MyThread(String name)
    {
        super(name);
    }

    @Override
    public void run()
    {
        int i = 0;
        while(i < 20)
        {
            System.out.println("Thread " + this.getName());
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
            i++;
        }
    }
}

class MyThread1 extends Thread {
    public MyThread1(String name)
    {
        super(name);
    }

    @Override
    public void run()
    {
        int i = 0;
        while(i < 20)
        {
            System.out.println("Thread 1 " + this.getName());
           
            i++;
        }
    }
}

public class ThreadMethods {
    
    public static void main(String[] args) throws InterruptedException {
        
        MyThread t1 = new MyThread("Harry");
        MyThread1 t2 = new MyThread1("null");
        t1.start();
        //t1.join();
        t2.start(); 
    }
}
