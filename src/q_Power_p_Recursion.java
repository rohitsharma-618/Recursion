import java.util.Scanner;

public class q_Power_p_Recursion {
    static int power(int p, int q ){                                    //   time complexity = O(q)
                                                                       //    space complexity = O(q)
        //base case
        if (q == 0) return 1;

        return power(p,q-1) * p ;
    }
    static int pow(int p, int q){                                        //   time complexity = O(log q)
                                                                        //    space complexity = O(log q)
        if (q==0) return 1;

        //even
        if (q %2 ==0 ){
            int smallPower = pow(p, q / 2);
        return smallPower * smallPower;
        }
        //odd
        else
          return pow(p,q/2) * pow(p,q/2) * p;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("p = ");
        int p = sc.nextInt();
        System.out.print("q = ");
        int q = sc.nextInt();


        System.out.println("power of p^q = " +power(p,q));

        System.out.println("power of p^q in second method = " +pow(p,q));

    }
    }
