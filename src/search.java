import java.util.ArrayList;

public class search {

    // to return an array list for all index present in the given array;
    static ArrayList<Integer> allIndexes(int[] arr, int target, int idx) {
        if (idx >= arr.length) {
            return new ArrayList<Integer>(); // return empty array list
        }
        ArrayList<Integer> Ans = new ArrayList<>();

        // self work
        if (arr[idx] == target) {
            Ans.add(idx);
        }
        //recursive work
        ArrayList<Integer> smallAns = allIndexes(arr, target, idx + 1);
        Ans.addAll(smallAns);
        return Ans;
    }

    // return all index of target if target is present in array ;

    static void findAllIndex (int [] arr, int target , int idx){
        // base case
        if (idx >= arr.length) return ;

        //self work
        if (arr[idx] == target){
            System.out.println(idx);
        }
        //recursive work
        findAllIndex(arr,target,idx+1);
    }

    // find first index --->return index of target if target is present in array, otherwise return -1 ;
    static int findIndex1(int[] arr, int target, int idx) {
        //base case
        if (idx >= arr.length) return -1;
        // self work
        if (arr[idx] == target) return idx;

        //recursive work
        return findIndex1(arr, target, idx + 1);
    }

    // return --> true/false  -----> based on existence
    static boolean findIndex(int[] arr, int target, int idx) {
        //base case                                                        time complexity = n(O)
        if (idx >= arr.length) return false;                             // space complexity = n(O)
        // self work
        if (arr[idx] == target) return true;

        //recursive work
        return findIndex(arr, target, idx + 1);

//        if (findAllIndex(arr, target, idx + 1)) {
//            return true;
//        }else {
//            return false;
//        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 8, 54, 8, 5, 8, 6, 1};
        int target = 8;

        ArrayList<Integer> Ans = allIndexes(arr,target,0);
        for (Integer i : Ans){
            System.out.println(i);
        }

        System.out.println("==========");

        System.out.println(findIndex1(arr,target,0));

        System.out.println(" ========== ");

        if (findIndex(arr, target, 0)) {
            System.out.println("Yes Found");
        } else {
            System.out.println("Not Found");
        }

        System.out.println("==========");

        findAllIndex(arr,target, 0);
    }
}
