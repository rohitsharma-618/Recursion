import java.util.Scanner;

public class sumSubset {
    static void sum (int [] a ,int n,int idx, int currAns){
        if (idx >= n){
            System.out.println(currAns);                             //  time complexity = O(n)
            return;                                                      // space complexity = O(n^2)
        }

        sum(a, n , idx +1,  currAns + a[idx]);      //   --> add curr + sum  == include
        sum(a, n, idx +1, currAns );       // -->  curr ans  == exclude
    }

    public static void main(String[] args) {
      int [] a = {2,4,5};
        sum(a,a.length,0,0); 
    }
}
