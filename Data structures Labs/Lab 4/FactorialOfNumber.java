import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int N =scanner.nextInt();
        System.out.println(factorial(N));
        System.out.println(factorialUnsingRecursion(N));
    }
    public static int factorial(int N){//O(n)
        int result = 1;
        while(N > 0){
            result *=N;
            N--;
        }
        return result;
    }
    public static int factorialUnsingRecursion(int N){//O(n)
        if(N <= 0){
            return 1;
        }
        return N * factorialUnsingRecursion(N-1);
    }
}
