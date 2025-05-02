public class Dead_Lock {

  private static final Object lock1 = new Object();
  private static final Object lock2 = new Object();

  public void method1(){
    synchronized(lock1){
        System.out.println("Thread 1 holding lock1..");
        try {
            Thread.sleep(100);
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        synchronized(lock2){
            System.out.println("Thread 2 is running");
        }
    }
  }

    public static void main(String[] args) {
        Dead_Lock deadlock = new Dead_Lock();

        Thread t1 = new Thread(() -> deadlock.method1());
        Thread t2 = new Thread(() -> deadlock.method2());

        t1.start();
        t2.start();
    }
}
