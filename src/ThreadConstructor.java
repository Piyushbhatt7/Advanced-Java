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

public class ThreadConstructor {
    
    public static void main(String[] args) {
        
        MyThtr t1 = new MyThtr("Piyush");
        t1.start();
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        System.out.println(t1.getPriority());
    }
}
