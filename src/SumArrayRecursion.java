import java.util.Scanner;

public class SumArrayRecursion {
    static int SumArray(int [] arr , int idx){
        //base case
        if (idx == arr.length) {
            return 0;
        }
        // sub-problem
        int smallAns = SumArray(arr,idx+1 );

        //self work
        return smallAns + arr[idx];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(SumArray(arr,0));
    }
}
