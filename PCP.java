class item {
    int i;
    boolean produced = false;

    public void synchronized producer(int x)
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
        
    }
    
}


public class PCP {
    

}
