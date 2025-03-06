class MyThread extends Thread {
    public MyThread(String name)
    {
        super(name);
    }

    public void run()
    {
        int i = 0;
        while(i < 20)
        {
            System.out.println("Thread " + this.getName());
            i++;
        }
    }
}

class MyThread1 extends Thread {
    public MyThread1(String name)
    {
        super(name);
    }

    public void run()
    {
        int i = 0;
        while(i < 20)
        {
            System.out.println("Thread " + this.getName());
            i++;
        }
    }
}

public class ThreadMethods {
    
    public static void main(String[] args) {
        
        MyThread t1 = new MyThread("Harry");
        t1.start();
    }
}
