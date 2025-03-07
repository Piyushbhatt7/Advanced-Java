class Practice extends Thread {

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

public class ThreadPractice {
    
    public static void main(String[] args) {
        
        Practice t1 = new Practice();
        Practice2 t2 = new Practice2();
        t1.start();
        t2.start();
    }
}
