

public class LinkedList_Reverse {
    
    Node head;

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

    public void addLast(String data)
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
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null)
        {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        
        System.out.println("Null");
    }

    public void reverseIterate()
    {

        if(head == null)
        {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;

        while(currNode != null)
        {
           Node nextNode = currNode.next;
           currNode.next = prevNode;

           // update
           prevNode = currNode;
           currNode = nextNode;
        }
    }
 
    
    public static void main(String[] args) {
        
        LinkedListEx1 list = new LinkedListEx1();
        list.addFirst("1");
        list.addFirst("2");
        

        list.addLast("3");
        

        list.addFirst("4");
        list.printList();
        
    }
}
