class MyThread extends Thread{

    public MyThread(String name)
    {
        super(name);
    }

    @Override
    public void run()
    {
        int i = 0;
        while (i < 30) { 
            
            System.out.println("I am a thread");
            i++;
        }
    }
}
public class ThreadConstructor {
    
    public static void main(String[] args) {
        
        MyThread t1 = new MyThread("Piyush");
        t1.start();
        System.out.println("Thread t1 id: " + t1.getId());
        System.out.println("Thread t1 name: " + t1.getClass());
    }
}
