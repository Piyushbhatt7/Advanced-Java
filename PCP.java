class item {
    int i;
    boolean produced = false;

    public synchronized void producer(int x)
    {
        if(produced)
        {
            try{
                wait();
            }
            catch(Exception e)
            {
              System.out.println(e);
            }
        }

        i = x;
    produced = true;
    notify();
    }

    public synchronized void consume()
    {
        if(!produced)
        {
           try {
                wait();
           } catch (Exception e) {
            System.out.println(e);
           }
        }
        
        produced = false;
        notify();
    }
    
}


public class PCP {
    
    public static void main(String[] args) {
        
        item i = new item();
        
        Thread t1 = new Thread(() -> {
            for(int j = 0; j < 10; j++)
            {
                i.producer(j);
                System.out.println("Produced: " + j);
            }
        });  
        
        Thread t2 = new Thread(() -> {
            for(int j = 0; j < 10; j++)
            {
                i.consume();
                System.out.println("Consumed: " + j);
            }
        });
        
        t1.start();
        t2.start();
    }
}
