
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
        Node newNode = new Node(data);
        if(head == null)
        {
           head = newNode;
           return;
        }

        newNode.next = head;
        head = newNode;

    }

    // add-last

    public void addLast(String last)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
           head = newNode;
           return;
        }

        Node currNode = head;
        while(currNode.next != null)
        {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // print

    public void printList()
    {
        Node currNode = head;
        while(currNode.next != null)
        {
            System.out.println(currNode.data + " -> ");
            currNode = currNode.next;
        }
        
        currNode.next = null;
    }

    
    public static void main(String[] args) {
        
        LinkedListEx1 list = new LinkedListEx1();
        list.addFirst("a");
        list.addFirst("is");
        
    }
}
