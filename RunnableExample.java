class MyRunnable implements Runnable {

    @Override
    public void run()
    {
        int i = 0;
        while(i <= 20)
        {
            System.out.println("I am a thread not a thread");
            i++;
        }  
                
    }      
}   
  
class MyRunnable2 implements Runnable {

    @Override
    public void run()
    {
        int i = 0; 
        while(i <= 20)
        {
            System.out.println("I am a thread 2");
            i++;
        }
        
    }
}


public class RunnableExample {
    
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable();
        MyRunnable2 r2 = new MyRunnable2();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
