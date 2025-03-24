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

            }
        }
    }
}


public class PCP {
    

}
