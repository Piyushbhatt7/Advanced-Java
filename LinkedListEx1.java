
import java.lang.classfile.components.ClassPrinter;

public class LinkedListEx1 {

    class Node {

        String data;
        Node next;

        Node(String data)
        {
            this.data = data;
            this.next = null;
        }
    }

    // add - first, add- last
    public void addFirst(String data)
    {
        Node newNode = Node(data);
        if(head == null)
        {
           head = newNode;
           return;
        }
    }
    
    public static void main(String[] args) {
        
        LinkedListEx1 lle = new LinkedListEx1();
        

    }
}
