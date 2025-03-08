class Practice extends Thread {

    @Override
    public void run()
    { 
        int i = 0;
        while(i < 20)  
        {
            System.out.println("Good Morning");
            i++;
        } 
    }                    
}

class Practice2 extends Thread {

    @Override
    public void run()
    { 
        int i = 0;
        while(i < 20)
        {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
            System.out.println("Welcome");
            i++;
        }
    }
}

public class ThreadDelayPractice {
    
    public static void main(String[] args) {
        

    }
}
