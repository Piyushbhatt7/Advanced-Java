class MyRunnable implements Runnable {

    @Override
    public void run()
    {
        for(int i = 0; i < 10; i++)
        System.out.println("I am a thread not a thread");
        
    }
}

class MyRunnable2 implements Runnable {

    @Override
    public void run()
    {
        System.out.println("I am a thread 2");
    }
}


public class RunnableExample {
    
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable();
        MyRunnable2 r2 = new MyRunnable2();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
