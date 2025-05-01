public class RunnableClass implements Runnable{

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Runnable thread");
        }
    }

    public static void main(String[] args) {
        
        RunnableClass rc = new RunnableClass();
        Thread t1 = new Thread(rc);

        t1.start();
    }
}
