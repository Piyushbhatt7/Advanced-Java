class MyThread extends Thread {

    @Override
    public void run() 
    {
        int i = 0;
        while (i < 20) { 
            System.out.println("MY thread is running...");
            System.out.println("I am happy !");
        }
        
    }
}

class MyTHread2 extends Thread {
    
    @Override
    public void run()
    {
        while (true) { 
            System.out.println("Thread 2 is running...");
            System.out.println("I am sad !");
        }
    }
}

public class ThreadClass1 {
    
    public static void main(String[] args) {
        
        MyThread t1 = new MyThread();
        MyTHread2 t2 = new MyTHread2();

        t1.start();
        t2.start();
    }
}
