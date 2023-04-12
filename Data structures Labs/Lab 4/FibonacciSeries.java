import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int N = scan.nextInt();
        fibonacciSeriesUsingLoop(N);
        fibonacciSeriesUsingRecursion(N);
    }
    static  void fibonacciSeriesUsingLoop(int N){//O(m) m is number of fibonacci number between 0 and N;
        int a =0, b =1, c = 0;
        while(a<=N){
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
    static void fibonacciSeriesUsingRecursion(int N){
        for(int i =0; i<=N; i++){
            int m = Fib(i);
            if(m <= N){
                System.out.print(m + " ");
            }
            else{
                return;
            }
        }
    }
    static int Fib(int N){
        if(N < 2)
            return N;
        return Fib(N-1) + Fib(N-2);
    }
}
