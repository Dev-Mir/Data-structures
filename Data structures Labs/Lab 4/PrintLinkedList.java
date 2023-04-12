public class PrintLinkedList {
    class Node{
        int data = 0;
        Node next = null;
        Node(int data){
            this.data = data;
        }
    }
    Node head = null;
    Node tail = null;
    public void add(int data){
        if(head == null){
            head = tail = new Node(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
    }
    public void printUsingRecursion(){
        printUsingRecursion(head);
    }
    public void printUsingLoop(){//O(n)
        Node node = head;
        while(node != null){
            System.out.print(node.data+" ");
            node = node.next;
        }
    }
    public void printUsingRecursion(Node head){//O(n)
        if(head == null){
            System.out.println();
            return;
        }
        System.out.print(head.data + " ");
        printUsingRecursion(head.next);
    }

    public static void main(String[] args) {
        PrintLinkedList list = new PrintLinkedList();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(8);
        System.out.println("Print Linked List Using Recursion");
        list.printUsingRecursion();
        System.out.println("Print Linked List Using Iterative Approach");
        list.printUsingLoop();
    }
}

