

public class LinkedList_Reverse {
    
    Node head;

    class Node {

        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    // add - first, add- last
    public void addFirst(int data)
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

    public void addLast(int data)
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

        if(head == null || head.next == null)
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
        head.next = null;
        head = prevNode;
    }

    public Node rverseResursive(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
       Node newHead = rverseResursive(head.next);
       head.next.next = head;
       head.next = null;

       return newHead;
    }
 
    
    public static void main(String[] args) {
        
        LinkedList_Reverse list = new LinkedList_Reverse();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);             
        list.printList();                  

        list.head = list.rverseResursive(list.head);
        list.printList();
        
    }
}
