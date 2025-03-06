class MyThread extends Thread{

    public MyThread(String name)
    {
        super(name);
    }

    public void run()
    {
        while (true) { 
            
            System.out.println("I am a thread");
        }
    }
}
public class ThreadConstructor {
    
    public static void main(String[] args) {
        
    }
}
