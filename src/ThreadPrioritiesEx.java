class MyThtr extends Thread {

    public MyThtr(String name)
    {
        super(name);
    }

    public void run()
    {
        
            System.out.println("I am a thread " + getName());
        
    }
}

public class ThreadPrioritiesEx {
    
    public static void main(String[] args) {
        
        MyThtr t1 = new MyThtr("Aman");
        MyThtr t2 = new MyThtr("Subham");
        MyThtr t3 = new MyThtr("Kunal");

        t3.setPriority(10);
        t2.setPriority(1);
        t1.setPriority(5);

        t1.start();
        t2.start();
        t3.start();
    }
}
