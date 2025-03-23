class MyThtr extends Thread {

    public MyThtr(String name)
    {
        super(name);
    }

    public void run()
    {
        
            System.out.println("I am a thread");
        
    }
}

public class ThreadPrioritiesEx {
    
    public static void main(String[] args) {
        
        MyThtr t1 = new MyThtr("Aman");
        MyThtr t2 = new MyThtr("Subham");
    }
}
