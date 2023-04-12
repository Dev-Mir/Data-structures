public class IterativeMergeSort {
	public static void mergeSort(int arr[]) {
		int n = arr.length;
		int size;
		int start;

		for (size = 1; size <= n-1; size = 2*size){
			for (start = 0; start < n-1; start += 2*size){
				int mid = start + size - 1 < n-1 ? start+size-1 : n-1;
				int end = start + 2*size - 1 < n-1 ? start+2*size -1 : n-1;

				int leftLength = mid - start + 1;
				int rightLength = end - mid;

				int left[] = new int[leftLength];
				int right[] = new int[rightLength];

				for (int i = 0; i < leftLength; i++) left[i] = arr[start + i];
				for (int i= 0; i < rightLength; i++) right[i] = arr[mid + 1+ i];

				int i = 0, j = 0,k = start;
				while (i < leftLength && j < rightLength) {
					if (left[i] <= right[j])arr[k++] = left[i++];
					else arr[k++] = right[j++];
				}
				while (i < leftLength)arr[k++] = left[i++];
				while (j < rightLength) arr[k++] = right[j++];
			}
		}
	}
}