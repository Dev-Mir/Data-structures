import java.util.*;
class Stack {

    private int arr[];
    private int top;
    private int capacity;
    
    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    public void push(int x){
        if(top<capacity-1){
            arr[++top] = x;
            System.out.println("Inserting " + x);
        }
        else
            System.out.println("Stack is full");
    }
    public int pop(){
        if(top > -1){
            System.out.println("Removing " + arr[top]);
            return arr[top--];
        }
        else
            System.out.println("Stack is empty");
        return 0;
    }
    public int peek(){
        if(top > -1){
            return arr[top];
        }
        else
            System.out.println("Stack is empty");
        return 0;
    }
    public int size(){
        
        return top+1;
    }
    public boolean isEmpty(){
        if(top == -1)
            return true;
        return false;
    }
    public boolean isFull(){
        if(top == capacity-1)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.pop();
        stack.push(3);
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is " + stack.size());
        
        stack.pop();
        
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
        }
        else
            System.out.println("Stack is not empty");
    }
    
}
