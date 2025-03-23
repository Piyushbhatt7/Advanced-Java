class MyThtr extends Thread {

    public MyThtr(String name)
    {
        super(name);
    }

    public void run()
    {
        int i = 0;
        while(i <=20)
        {
            System.out.println("I am a thread");
        }
        i++;
    }
}

public class ThreadConstructor {
    
    public static void main(String[] args) {
        
        MyThtr t1 = new MyThtr("Piyush");
        t1.start();
    }
}
