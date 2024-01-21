public class FrogJumpProblem {
    static int frogJump( int [] h , int n , int idx ){

        if (idx == n - 1 ) return 0;                                           // time complexity = O(2^n)

        int option1 =Math.abs(h[idx] - h[idx+1]) + frogJump(h,n,idx + 1);
        if (idx == n - 2) return option1;
        int option2 =Math.abs( h[idx] - h[idx+2] ) + frogJump(h,n,idx + 2);

        return Math.min(option1,option2);
    }

    public static void main(String[] args) {
        int [] h = {10,30,40,20};
        System.out.println(frogJump(h, h.length, 0));
    }
}
