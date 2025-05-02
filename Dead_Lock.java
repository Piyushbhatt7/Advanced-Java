public class Dead_Lock {
    
    public static void main(String[] args) {
        
        private final Object lock1 = new Object();
        private final Object lock2 = new Object();

        public void method1(){
            synchronized(lock1){
                synchronized(lock2)
                {

                }
            }
        }
      
        public void method2()
        {
            synchronized(lock2)
            {
                synchronized(lock1)
                {
                    
                }
            }
        }

    }
}
