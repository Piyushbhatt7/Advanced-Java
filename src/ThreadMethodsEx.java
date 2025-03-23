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
            System.out.println(" I am a thread 1");
            i++;
        }
            
        
    }
}

class MyThtrM1 extends Thread {

    public MyThtrM1(String name)
    {
        super(name);
    }

    public void run()
    {
        int i = 0;
        while(i < 20)
        {
            System.out.println(" I am a thread 2");
            i++;
        }
            
        
    }
}

public class ThreadMethodsEx {
    
    public static void main(String[] args) throws InterruptedException {
        
        MyThtrM t1 = new MyThtrM("Piyush");
        MyThtrM1 t2 = new MyThtrM1("Sasha");

        // System.out.println(t1.getName());
        // System.out.println(t2.getName());

        t1.start();
        // t1.join();
        //t2.sleep(5000);
        t2.start();
    }
}
