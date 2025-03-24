class item {
    int i;
    boolean produced = false;

    public void synchronized producer(int i)
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
    }

    public void synchronized consume()
    {
        if(!produced)
        {
            wait();
        }
    }
}


public class PCP {
    

}
