import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
    Node(){
    }
}
class StackUsingLL{

    private Node top;
    
    StackUsingLL(){
        top = null;
    }
    public void push(int x){
        Node node = new Node(x);
        if(top != null){
           node.next = top;
           top = node;
        }
        else
            top = node;
        System.out.println("Inserting " + x);
    }
    public void pop(){
        if(top != null){
            System.out.println("Removing " + top.data);
            top = top.next;
        }
        else
            System.out.println("Stack is empty");
    }
    public int peek(){
        if(top != null){
            return top.data;
        }
        else
            System.out.println("Stack is empty");
        return 0;
    }
    public boolean isEmpty(){
        if(top == null)
            return true;
        return false;
    }
    public static void main(String[] args) {
        StackUsingLL stack = new StackUsingLL();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println("Top element is: " + stack.peek());
        
        stack.pop();
        stack.pop();
        stack.pop();
        
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
        }
        else
            System.out.println("Stack is not empty");
    }
    
}
