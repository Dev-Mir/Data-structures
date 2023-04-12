class StackUsingQueues{
	QueueUsingLL q1, q2;
	StackUsingQueues(){
		q1 = new QueueUsingLL();
		q2 = new QueueUsingLL();
		
	}
	public void push(int item){
		q1.enqueue(item);
	}
	public int pop(){
		int num = -1;
		while(true){
			num = q1.peek();
			q1.dequeue();
			if(!q1.isEmpty()){
			q2.enqueue(num);
			}
			else
				break;
		}
		q1 = q2;
		q2 = new QueueUsingLL();
		return num;
	}
	public static void main(String[] sk){
		StackUsingQueues sq = new StackUsingQueues();
		sq.push(1);
		sq.push(2);
		sq.push(3);
		sq.push(4);
		
		System.out.println(sq.pop());
		System.out.println(sq.pop());
		System.out.println(sq.pop());
		System.out.println(sq.pop());
		
	}
	
}