import java.util.*;
class QueueUsingStacks{
	private StackUsingLL s1, s2;
	QueueUsingStacks(){
		s1 = new StackUsingLL();
		s2 = new StackUsingLL();
	}
	public void enqueue(int data){
		s1.push(data);
	}
	public int dequeue(){
		while(!s1.isEmpty()){
			s2.push(s1.peek());
			s1.pop();
		}
		int num = s2.peek();
		s2.pop();
		while(!s2.isEmpty()){
			s1.push(s2.peek());
			s2.pop();
		}
		return num;
	}
	public static void main(String[] sk){
		QueueUsingStacks qs = new QueueUsingStacks();
		
			qs.enqueue(1);
			qs.enqueue(2);
			qs.enqueue(3);
			qs.enqueue(4);
		System.out.println(qs.dequeue());
		System.out.println(qs.dequeue());
		
	}
}