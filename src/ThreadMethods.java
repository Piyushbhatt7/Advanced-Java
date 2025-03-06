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
        }
    }
}


public class ThreadMethods {
    
    public static void main(String[] args) {
        
    }
}
