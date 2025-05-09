public class Dead_Lock {

  private static final Object lock1 = new Object();
  private static final Object lock2 = new Object();

  public void method1(){
    synchronized(lock1){
        System.out.println("Thread 1 holding lock1..");
        try {
            Thread.sleep(1000);
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        synchronized(lock2){
            System.out.println("Thread 2 is running");
        }
    }
  }

  public void method2()
  {
    synchronized(lock2)
    {
        System.out.println("Thread 2 holding");
        try {
            Thread.sleep(200);
        } catch (Exception e) {
        }
    }

    synchronized(lock1)
    {
        System.out.println("Thread 2 running");
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
