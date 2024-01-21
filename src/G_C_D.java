import java.util.Scanner;

public class G_C_D {
    /*
    GCD Stands for GREATER COMMON DIVISOR and also called HCF
     */
    static int BruteForceApproach(int x, int y) {                 // Euclid's Algo.
        if (y == 0) {
            return x;
        }
        else {
            return BruteForceApproach(y, x % y);
        }
    }

    static int LongDivisionMethod(int x,int y){
        while (x%y != 0){
            int remander = x%y;
            y = x;
            x = remander;
        }
        return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y = sc.nextInt();

       // System.out.println("GCD OF " +x+ " & " +y+ " is = " +BruteForceApproach(x,y));

        int lcm = (x*y)/BruteForceApproach(x,y);                                             // for LCM of the numbers
        System.out.println(lcm);

        System.out.println("GCD OF " +x+ " & " +y+ " is = " +LongDivisionMethod(x,y));
    }
}