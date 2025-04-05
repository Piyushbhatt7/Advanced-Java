public class LinkedListEx2 {
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

    // delete first
    public void deleteFist()
    {
        if(head == null)
        {
            System.out.println("The list is empty");
            return;
        }

        head = head.next;
    }

    // delete last
    public void deleteLast()
    {
        if(head == null)
        {
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
    }

    
    public static void main(String[] args) {
        
        LinkedListEx1 list = new LinkedListEx1();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("linked list");
        list.printList();

        list.addFirst("this");
        list.printList();
        
    }
}
