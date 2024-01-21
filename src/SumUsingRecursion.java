import java.util.Scanner;

public class SumUsingRecursion {

    static  int count(int n){                                 //   time complexity = O(log10(n))
                                                             //    space complexity = O(log10(n))
        if (n >= 0 && n <= 9 ) return 1;

        return count(n / 10) + 1 ;
    }
    static int sum(int n ){
        // base case
        if (n >= 0 && n <= 9 ) return n;
       //                                                         time complexity = O(d)   // d refers to the digits
//                                                               space complexity = O(d)
//        //sub - problem
//        int prevSum = sum(n/10);
//
//        //self work - recursive work
//        int FinalSum = sum(n%10);
//
//        return prevSum + FinalSum ;

        return sum(n / 10) + sum(n % 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("sum of " +n+ " = "+sum(n));
        System.out.println("count of " +n+ " = " +count(n));
    }
}
