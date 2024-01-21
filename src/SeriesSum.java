import javax.swing.*;
import java.util.Scanner;

public class SeriesSum {

    static int sum(int n ){
        if (n == 0) return 0;

       return sum(n-1) + n ;
    }

    static  int sum1(int n ){
        if (n == 0) return 0;                                      // time complexity = O(n)
                                                                  // space complexity = O(n)

        if (n % 2 == 0 ){       //even
           return sum1(n-1) - n;
        }                                                     // enter 5 = 1-2+3-4+5 = 3
        else {   //odd
            return sum1(n - 1) + n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("sum of " +n+ " numbers is = " +sum(n));

        System.out.println("sum of " +n+ " alternate number is = " +sum1(n));
    }
}
