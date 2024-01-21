import java.util.Scanner;

public class TargetArrayValue {
    static int findIndex(int[] arr , int target ,int idx) {
        if (idx >= arr.length) {
            return -1;
        }
        // self work
        if (arr[idx] == target) {
            return idx;
        }
        return findIndex(arr, target, idx + 1);
    }
        static boolean targetValue(int[] arr , int target ,int idx){
    if (idx >= arr.length) {
        return false;
    }
   // self work
        if (arr[idx] == target){
            return true;
        }

        return targetValue(arr,target,idx + 1 );

   // sub-problem
//        if (targetValue(arr, target,idx + 1)){
//            return true;
//        }
//        else {
//            return false;
//        }

    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();

        int [] arr = {4 , 12 , 54 , 14 , 3 , 8 , 6 , 1};
//        int target =14 ;

//       if (targetValue(arr,9,0))
//        {
//           System.out.println("yes");
//       }
//       else{
//           System.out.println("no");
//       }
        System.out.println(findIndex(arr,9,0));
    }
}
