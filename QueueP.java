public class QueueP {
    
    static class Queue {

        static int arr[];
        static int size;
        static int rear = -1;

        public Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty()
        {
            return rear == -1;

        }

        // add // enqueue
        public static void add(int data)
        {
            if(rear == size-1)
            {
                System.out.println("full queue");
                return;
            }
        }
        
    }

    public static void main(String[] args) {
        
    }
}
