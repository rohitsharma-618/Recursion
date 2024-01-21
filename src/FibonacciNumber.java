import java.util.Scanner;

public class FibonacciNumber {

    static int Fibonacci(int n ){
        // base case
//        if (n== 0) return 0;                                  time complexity = O(2^n)
//                                                               space complexity = O(n)
//        if (n == 1) return 1;
        if (n ==0 || n == 1 ) {return n;}
        //sub-problem - recursive work
//        int prev = Fibonacci(n-1);
//        int prevPrev = Fibonacci(n-2);

         //self - work
//        int ans = prev + prevPrev;
//        return ans;
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

        for (int i = 0 ;i <= n ;i++){
        System.out.print(" " +Fibonacci(i));
        }

    }
}
