import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SearchNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        Random random = new Random();
        for(int i=0; i<arr.length; i++){
            arr[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter number to search value");
        int N = scanner.nextInt();
        System.out.println(searchValue(N, arr));
        System.out.println(searchValueUsingRecursion(N, arr));
    }
    static int searchValue(int n, int[] arr){//O(n)
        for(int num : arr){
            if(num == n){
                return 1;
            }
        }
        return 0;
    }
    static int searchValueUsingRecursion(int n, int[] arr){//O(n)
        if(arr[0] == n){
            return 1;
        }
        else if(arr.length == 1 ){
            return 0;
        }
        return searchValue(n, Arrays.copyOfRange(arr, 1, arr.length));
    }
}