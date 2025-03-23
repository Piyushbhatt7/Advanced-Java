class MyThtrM extends Thread {

    public MyThtrM(String name)
    {
        super(name);
    }

    public void run()
    {
        
            System.out.println("I am a thread");
        
    }
}

public class ThreadMethodsEx {
    
    public static void main(String[] args) {
        
        MyThtrM t1 = new MyThtrM("Piyush");
        MyThtrM t2 = new MyThtrM("Sasha");

        t1.start();
        t2.start();
    }
}
