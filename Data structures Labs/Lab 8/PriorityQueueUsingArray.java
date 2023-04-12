class PriorityQueueUsingArray   
{   
    // create an array
	private int[] arr;
	private int size = 0;
    // constructor
    public PriorityQueueUsingArray() {
	// initialize an array
		arr = new int[10];
		size  =0;
    }
    public void insert(int data) {    	 
    	// insert data in array in any order
    	// handle all possible exceptions/errors        
		if(size < arr.length){
			arr[size++] = data;
		}
		else
			System.out.println("Queue is Full");
    	
    }
    
    public int extractMax() {   	 
    	// return and remove max value from array
    	// handle all possible exceptions/errors
		int max = arr[0];
		int index =0;
		for(int i=1; i<arr.length; i++){
			if(max<arr[i]){
				max = arr[i];
				index = i;
			}
		}
		for(int i = index; i<arr.length-1; i++){
			arr[i] = arr[i+1];
		}
		size--;
		return max;
    }
    
    public int getMax() {      	 
    	// just return max value from array
    	// handle all possible exceptions/errors
		int max = arr[0];
		for(int i=1; i<arr.length; i++){
			if(max<arr[i]){
				max = arr[i];
			}
		}
		return max;
    }
    
    public boolean searchData(int data) {      	 
    	// search data from array
    	// handle all possible exceptions/errors
		for(int i=0; i<arr.length; i++){
			if(data == arr[i]){
				return true;
			}
		}
		return false;
    }
    
    public static void main(String[] args)   
    {   
        // Test the main method by creating object for PriorityQueueUsingArray class
    	PriorityQueueUsingArray obj  = new PriorityQueueUsingArray();
    	// insert some values using insert method
    	obj.insert(1);
    	obj.insert(2);
    	obj.insert(3);
    	obj.insert(4);
    	obj.insert(5);
    	obj.insert(6);
    	
    	// call extractMax method and print output
    	System.out.println(obj.extractMax());
    	
    	// call extractMax method and print output
    	System.out.println(obj.extractMax());
    	
    	
    	// insert some values using insert method
    	obj.insert(7);
    	obj.insert(8);
    	
    	// call getMax method and print output
    	System.out.println(obj.getMax());
    	
    	// call extractMax method and print output
    	System.out.println(obj.extractMax());
    	
    }   
}   