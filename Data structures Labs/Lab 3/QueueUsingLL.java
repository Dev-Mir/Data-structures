import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class QueueUsingLL {
    private Node rear = null, front = null;
    
    public void dequeue(){
      if(rear != null){
          System.out.println("Removing " + rear.data);
          rear = rear.next;
      }
      else
            System.out.println("QueueUsingLL is empty");
    }
    public void enqueue(int item){
        Node node = new Node(item);
         if(rear == null){
           rear = node;
           front = rear;
         }
         else{
             front.next = node;
             front = node;
         }
         System.out.println("Inserting " + item);
    }
    public int peek(){
        if(rear != null){
            return rear.data;
        }
        System.out.println("QueueUsingLL is full");
        return 0;
    }
    public boolean isEmpty(){
        if(rear == null){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
       QueueUsingLL q = new QueueUsingLL();
       
       q.enqueue(1);
       q.enqueue(2);
       q.enqueue(3);
       q.enqueue(4);
       
        System.out.println("Front element is: " + q.peek());
        
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        
        if(q.isEmpty())
            System.out.println("QueueUsingLL is empty");
        else
            System.out.println("QueueUsingLL is not empty");
    }
    
}
