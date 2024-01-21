import java.util.Scanner;

public class recursion1 {

    static void PrintDecreasing(int n ){

        // base case
        if (n == 1){
            System.out.println(n);
            return;
        }
        // self work
        System.out.println(n);

        // recursive work
        PrintDecreasing(n-1);
    }
    static void PrintIncrease(int n ){
        if (n == 1){
            System.out.println(n);
            return;
        }
        PrintIncrease(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        PrintIncrease(n);
        PrintDecreasing(n);
    }
}
