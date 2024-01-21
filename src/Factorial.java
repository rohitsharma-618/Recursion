import java.util.Scanner;

public class Factorial {

//    static int fact(int n){
//        if (n == 0)  return 1;                                    time complexity = O(n)
//                                                                   space complexity = O(n)
//        int smallInt = fact(n-1);
//
//        int ans = n * smallInt;
//
//        return ans;
//
//    }

    static int Fact(int n ){
        if (n == 0) return 1;

        return n * Fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        System.out.println(fact(7));

        System.out.print(n+ "! = " +Fact(n));
    }
}
