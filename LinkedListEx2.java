public class LinkedListEx2 {
    Node head;
    private int size;

    public LinkedListEx2() {
        this.size = 0;
    }

    

    class Node {

        String data;
        Node next;

        Node(String data)
        {
            this.data = data;
            this.next = null;
            size++;
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
    public void deleteFirst()
    {
        if(head == null)
        {
            System.out.println("The list is empty");
            return;
        }
        size--;

        head = head.next;
    }

    // delete last
    public void deleteLast()
    {
        size--;
        if(head == null)
        {
            System.out.println("The list is empty");
            return;
        }
       
        Node secondLast = head;
        Node lastNode = head.next; // head.next = null -> lastNode = null;

        if(head.next == null)
        {
            head = null;
            return;
        }

        while(lastNode.next != null) // null.next -> error
        {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize()
    {
        return size;
    }

    
    public static void main(String[] args) {
        
        LinkedListEx2 list = new LinkedListEx2();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("linked list");
        list.printList();
      
        list.addFirst("this");
        list.printList();

        System.out.println("deleted list");

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());

        
    }
}
