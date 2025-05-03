class Myclass {

    synchronized void add(int i)
    {
        Thread t = Thread.currentThread();

        for(int n = 1; n<=5; n++)
        {
           System.out.println(t.getName() + (i+n));
        }
    }
}

class Yourclass extends Thread {

    Myclass m = new Myclass();
    public void run()
    {
        m.add(100);
        
    }

}



public class Synchronization {
    
    public static void main(String[] args) {

        Yourclass y = new Yourclass();
        Thread t1 = new Thread(y);
        Thread t2 = new Thread(y);

        t1.setName("T1 ");  
        t2.setName("T2 ");             
      
        t1.start(); 
        t2.start();    
          
    }
}
