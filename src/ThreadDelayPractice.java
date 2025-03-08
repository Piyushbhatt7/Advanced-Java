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
            System.out.println("Welcome");
            i++;
        }
    }
}



public class ThreadDelayPractice {
    
    public static void main(String[] args) {
        
    }
}
