import java.util.Arrays;
class PriorityQueueUsingSortedArray{   
    // create an array
	private int[] arr;
	private int size = 0;
    // constructor
    public PriorityQueueUsingSortedArray() {
	// initialize an array
		arr = new int[10];
		size  =0;
    }
    public void insert(int data){    	 
    	// insert data in array in any order
    	// handle all possible exceptions/errors        
		if(size < arr.length){
			if(size == 0){
				arr[size++] = data;
				return;
			}
			for(int i=size-1; i>=0; i--){
				if(arr[i] > data){
					arr[i+1] = arr[i];
				}
				else{
					arr[i+1] = data;
					size++;
					break;
				}
			}
		}
		else
			System.out.println("Queue is Full");
    }
    
    public int extractMax() {   	 
    	// return and remove max value from array
    	// handle all possible exceptions/errors
		int max = 0;
		if(size != 0){
			max = arr[--size];
		}
		return max;
    }
    
    public int getMax() {      	 
    	// just return max value from array
    	// handle all possible exceptions/errors
		int max = 0;
		if(size != 0){
			max = arr[size-1];
		}
		return max;
    }
    
    public boolean searchData(int data) {      	 
    	// search data from array
    	// handle all possible exceptions/errors
		int low = 0, high = size-1;
		while(low <= high){
			if(arr[(low+high)/2] > data){
				high = (low+high)/2 - 1;
			}
			else if(arr[(low+high)/2] == data){
				return true;
			}
			else if(arr[(low+high)/2] < data){
				low = (low+high)/2 + 1;
			}
			
		}
		return false;
    }
    
    public static void main(String[] args)   
    {   
        // Test the main method by creating object for PriorityQueueUsingArray class
    	PriorityQueueUsingSortedArray obj  = new PriorityQueueUsingSortedArray();
    	// insert some values using insert method
    	obj.insert(1);
    	obj.insert(9);
    	obj.insert(3);
    	obj.insert(4);
    	obj.insert(11);
    	obj.insert(6);
    	
    	// call extractMax method and print output
    	System.out.println(obj.extractMax());
		
    	System.out.println(obj.searchData(11));
    	System.out.println(obj.searchData(5));
    	System.out.println(obj.searchData(4));
    	
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