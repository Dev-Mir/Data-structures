public class SortingData {
	
	public static Integer[] example = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
	
	
	public static Integer[] mergeSortBest = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};

	
	public static Integer[] mergeSortWorst = { 0, 16, 1, 17, 2, 18,  3, 19, 4,20, 5,21, 6,22,  7,23,  8,24,  9,25,  10,26, 11,27,  12,28,  13,29,  14,30,  15, 31};
	
	public static Integer[] quickSortBest = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
	
	
	public static Integer[] quickSortWorst = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 0,  2,  4, 6,  8,  10,  12,  14,  16,  18,  20,  22,  24,  26,  28,  30};

	public static void mergerSort(Integer arr[]){
		int n = arr.length;
		if(n < 2){
			return;
		}
		int mid = n/2;
		Integer l[] = new Integer[mid];
		Integer r[] = new Integer[n-mid];

		for(int i=0; i<l.length; i++)
			l[i] = arr[i];
		for (int i=0; i<r.length; i++)
			r[i] = arr[mid++];
		mergerSort(l);
		mergerSort(r);
		merge(l, r, arr);
	}
	private static void merge(Integer[] left, Integer[] right, Integer[] arr){
		int i =0, j =0 , k =0;
		while(i<left.length && j<right.length){
			if(left[i] <= right[j]){
				arr[k] = left[i++];
			}
			else{
				arr[k] = right[j++];
			}
			k++;

		}
		while(i<left.length){
			arr[k++] = left[i++];
		}
		while(j<right.length){
			arr[k++] = right[j++];
		}
	}
}
class QuickSort {

	public static <AnyType> void swapReferences( AnyType [ ] a, int index1, int index2 )
	{
		AnyType tmp = a[ index1 ];
		a[ index1 ] = a[ index2 ];
		a[ index2 ] = tmp;

	}

	public static <AnyType extends Comparable<? super AnyType>>
	void quicksort( AnyType [ ] a )
	{
		quicksort( a, 0, a.length - 1 );
	}

	private static <AnyType extends Comparable<? super AnyType>>
	void quicksort( AnyType [ ] a, int left, int right )
	{

		if (left >= right) return;

		int half = (left + right) / 2;
		AnyType pivot = a[half];
		swapReferences(a,half,right);
		int i = left-1, j = right;
		for( ; ; )
		{
			while( i<right && a[ ++i ].compareTo( pivot ) < 0 ) { }
			while( j>left && a[ --j ].compareTo( pivot ) > 0) { }
			if( i < j )
				swapReferences(a,i,j);
			else
				break;

		}

		swapReferences(a,right,i);

		quicksort( a, left, i - 1 );    // Sort small elements
		quicksort( a, i + 1, right );   // Sort large elements
	}
}