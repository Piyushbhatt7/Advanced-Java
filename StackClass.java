public class StackClass {
    
    static class Node {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            next = null;
        }

        static class Stack{
             public Node head;
             public static boolean isEmpty()
             {
                return head == null;
             }
             public static void push(int data)
             {
                if(isEmpty())
             }
        }
    }
}
