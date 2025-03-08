class Practice extends Thread {

    @Override
    public void run()
    { 
        
            System.out.println("Good Morning");
           
        } 
    }     
public class ThreadState {
    
    public static void main(String[] args) {
        Practice p = new Practice();
        p.setPriority(6);
        System.out.println(p.getPriority());
        
        p.start();
        System.out.println(p.getState());
    }
}
