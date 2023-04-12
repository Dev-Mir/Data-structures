//Task1
public class DoubleLinkedList {
    Node head;
    public void insertAtBeginning(String name){
        Node n = new Node(name);
        if(head != null){
        head.prev = n;
        n.next =  head;
        head = n;
        }
        else{
            head = n;
        }
    }
    public void insertAtBeginning(Node n){
        if(head != null){
        head.prev = n;
        n.next =  head;
        head = n;
        }
        else{
            head = n;
        }
    }
    public void insertAtEnd(String name){
        Node node = new Node(name);
        if(head != null){
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
            node.prev = temp;
        }
        else{
            head = node;
        }
    }
    public void insertAtEnd(Node node){
        if(head != null){
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
            node.prev = temp;
        }
        else{
            head = node;
        }
    }
    public void insertAfterName(String name, Node node){
        Node temp = head;
        while(temp != null){
            if(name.equals(temp.name)){
                node.next = temp.next;
                temp.next = node;
                node.prev = temp;
                node.next.prev = node;
                
                return;
            }
            temp = temp.next;
        }
        System.out.println("Name does not exist");
    }
     public void insertBeforeName(String name, Node node){
        Node temp = head;
        while(temp != null){
            if(name.equals(temp.name)){
                temp = temp.prev;
                node.next = temp.next;
                temp.next = node;
                node.prev = temp;
                node.next.prev = node;
                
                return;
            }
            temp = temp.next;
        }
        System.out.println("Name does not exist");
    }
    public void makeCircular(){
         if(head != null){
             Node temp = head;
             while(temp.next != null){
                 temp = temp.next;
             }
             temp.next = head;
             head.prev = temp;
         }
         else
             System.out.println("List is empty");
    }
    public void printAll(){
        Node temp = head;
        if(head != null)
        do{
            System.out.print(temp.name + " ");
            temp = temp.next;
        }while(temp != head && temp != null);
        else
            System.out.println("List is empty");
    }
    public static void main(String[] sk){
        DoubleLinkedList obj = new DoubleLinkedList();
        obj.insertAtBeginning("Shankar");
        obj.insertAtBeginning("Shahroo");
        obj.insertAtEnd("Farhan");
        obj.insertAfterName("Shahroo", new Node("Sahil"));
        obj.insertBeforeName("Sahil", new Node("Khan"));
        obj.makeCircular();
        
        obj.printAll();
    }
}
