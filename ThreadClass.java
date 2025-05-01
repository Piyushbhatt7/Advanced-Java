public class ThreadClass  extends Thread{
    
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread is running");
        }
        
    }
    
    public static void main(String[] args) {
        
        ThreadClass t1 = new ThreadClass();
        t1.start();
    }

}
