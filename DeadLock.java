

public class DeadLock {
    
    public static void main(String[] args) {
        
        void ri()
        {
            synchronized(lock1)
            {
                synchronized(lock2)
                {
                    System.out.println("Hii");
                }
            }
        }

        void r2()
        {
            synchronized(lock2)
            {
                synchronized(lock1)
                {
                    System.out.println("World");
                }
            }
        }
    }
}
