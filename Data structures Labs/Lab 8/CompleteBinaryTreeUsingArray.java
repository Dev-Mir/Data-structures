import java.util.Arrays;
class CompleteBinaryTreeUsingArray{
	int arr[] = null;
	int size = 0;
	CompleteBinaryTreeUsingArray(int n){
		arr = new int[10];
	}
	int parent(int i){
		return (i-1)/2;
	}
	int leftChild(int i){
		return 2*i +1;
	}
	int rightChild(int i){
		return 2 * i +2;
	}
	void shiftUp(int i){
		while(i>0 && arr[parent(i)] < arr[i]){
			int temp = arr[parent(i)];
			arr[parent(i)] = arr[i];
			arr[i] = temp;
			i = parent(i);
		}
	}
	void shiftDown(int i){
		int maxIndex  = i;
		int l = leftChild(i);
		
		if(l<arr.length && arr[l]>arr[maxIndex]){
			maxIndex = l;
		}
		
		int r = rightChild(i);
		
		if(r<size && arr[r]>arr[maxIndex]){
			maxIndex = r;
		}
		
		if(i!= maxIndex){
			int temp = arr[i];
			arr[i] = arr[maxIndex];
			arr[maxIndex] = temp;
			shiftDown(maxIndex);
		}
	}
	int extractMax(){
		int result = arr[0];
		arr[0] = arr[size-1];
		size--;
		shiftDown(0);
		return result;
	}
	void insert(int p){
		if(size == arr.length){
			return;
		}
		else{
			arr[size++] = p;
			shiftUp(size-1);
		}
	}
	void remove(int i){
		arr[i] = arr[0] +1;
		shiftUp(i);
		extractMax();
	}
	void changePriority(int i, int p){
		int oldp = arr[i];
		arr[i] = p;
		if(p>oldp){
			shiftUp(i);
		}
		else{
			shiftDown(i);
		}
	}
	boolean search(int p){
		for(int i =0; i<size; i++){
			if(arr[i] == p){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] sk){
		CompleteBinaryTreeUsingArray t = new CompleteBinaryTreeUsingArray(10);
		
		t.insert(4);
		t.insert(7);
		t.insert(89);
		t.insert(3);
		t.insert(30);
		t.insert(11);
		t.insert(9);
		t.insert(2);
		t.insert(45);
		t.insert(20);
		
		System.out.println(Arrays.toString(t.arr));
		t.remove(9);
		t.remove(8);
		t.insert(100);
		t.insert(105);
		System.out.println(Arrays.toString(t.arr));
		
		t.changePriority(8, 110);
		System.out.println(Arrays.toString(t.arr));
		
		System.out.println("tree contains 20 : " + t.search(20));
	}
	
}