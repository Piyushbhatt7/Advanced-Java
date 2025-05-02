public class Dead_Lock {
    
    public static void main(String[] args) {
        
        private final Object lock1 = new Object();
        private final Object lock2 = new Object();

        public void method1(){
            synchronized(lock1){
                synchronized(lock2)
                {
                    // Critical section
                    System.out.println("Thread 1: Holding lock1 and lock2...");
                    try { Thread.sleep(100); } catch (InterruptedException e) {}
                    System.out.println("Thread 1: Waiting for lock2...");
                }
            }
        }
      
        public void method2()
        {
            synchronized(lock2)
            {
                synchronized(lock1)
                {
                    System.out.println("Thread 1: Holding lock1 and lock2...");
                    try { Thread.sleep(100); } catch (InterruptedException e) {}
                    System.out.println("Thread 1: Waiting for lock2...");
                }
            }
        }

    }
}
