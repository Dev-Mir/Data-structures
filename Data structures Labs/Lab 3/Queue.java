import java.util.*;
class Queue{
	private int arr[];
	private int front;
	private int rear;
	private int capacity;
	private int count;
	
	Queue(int size){
		arr = new int[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	}
	public void dequeue(){
		if(count != 0){
			System.out.println("Removing " + arr[++rear]);
			if(rear == capacity-1){
				rear = -1;
			}
			count--;
		}
		else{
			System.out.println("Queue is Empty");
		}
	}

	public void enqueue(int item){
		if(count<capacity){
			arr[front%capacity] = item;
			front++;
			count++;
			System.out.println("Inserting " + item);
		}
		else{
			System.out.println("Queue is Full");
		}
	}
	public int peek(){
		if(count != 0){
			return arr[rear+1%capacity]; 
		}
		return -1;
	}
	public int size(){
		return count;
	}
	public boolean isEmpty(){
		return count == 0 ? true : false;
	}
	public boolean isFull(){
		return count == capacity ? true : false;
	}
	public static void main(String[] sk){
		Queue q = new Queue(5);
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		
		System.out.println("Front element is " + q.peek());
		q.dequeue();
		
		System.out.println("Front element is " + q.peek());
		System.out.println("Queue size is " + q.size());
		
		q.dequeue();
		q.dequeue();
		
		if(q.isEmpty())
			System.out.println("Queue is Empty");
		else
			System.out.println("Queue is Full");
		
	}
}