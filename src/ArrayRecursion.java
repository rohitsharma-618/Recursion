public class ArrayRecursion {

    static void PrintArray(int []arr, int idx){
        //base case
    if (idx == arr.length) {
        return ;
    }
              // self work
        System.out.print(" " +arr[idx]);

        // sub-problem
        PrintArray(arr, idx + 1);
    }

    static int printMxArray(int [] arr , int idx){                  //   time complexity = O(n)
                                                                   //    space complexity = O(n)

        //base case
        if (idx == arr.length - 1) {
            return arr[idx];
        }

        // sub-problem
        int smallAns = printMxArray(arr,idx + 1);

           // self work

        return Math.max(arr[idx], smallAns);

    }

    static int printMinArray(int [] arr , int idx){

        //base case
        if (idx == arr.length - 1) {
            return arr[idx];
        }

        // sub-problem
        int smallAns = printMinArray(arr,idx + 1);

        // self work

        return Math.min(arr[idx], smallAns);

    }

    public static void main(String[] args) {
        int [] arr = {5,6,1,8,9,10};


          PrintArray(arr,0);

        System.out.println(printMxArray(arr,0));

        System.out.println(printMinArray(arr,0));
    }
}
