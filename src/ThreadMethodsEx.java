class MyThtrM extends Thread {

    public MyThtrM(String name)
    {
        super(name);
    }

    public void run()
    {
        int i = 0;
        while(i < 20)
        {
            System.out.println(" I am a thread");
            i++;
        }
            
        
    }
}

public class ThreadMethodsEx {
    
    public static void main(String[] args) throws InterruptedException {
        
        MyThtrM t1 = new MyThtrM("Piyush");
        MyThtrM t2 = new MyThtrM("Sasha");

        System.out.println(t1.getName());
        System.out.println(t2.getName());

        t1.start();
        t1.join();
        t2.start();
    }
}
