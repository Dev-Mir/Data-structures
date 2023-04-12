import java.util.Arrays;

public class TwoSum {

	public static boolean twoSum( Integer[] a, int k) {
		SortingData.mergerSort(a);

		int right = 0;
		int left = a.length-1;
		while(right<left){
			if(a[right] + a[left] == k){
				return true;
			}
			else if(a[right] + a[left] < k){
				right++;
			}
			else{
				left--;
			}
		}

		return false;
	}
	public static void main(String[] args){
		Integer arr[] = {1, 7, 2, 8, 9, 2, 90, 34, 8, 89, 34};
		System.out.println(twoSum(arr, 10));
		System.out.println(twoSum(arr, 100));
		System.out.println(twoSum(arr, 91));
		System.out.println(twoSum(arr, 8));
		System.out.println(twoSum(arr, 99));
	}
}
