import java.util.Scanner;

public class N_K_Multiple {
    static void multiple(int n ,int k ){                                  //   time complexity = O(k)
                                                                         //    space complexity = O(k)
        if (k == 0){
            return;
        }
        multiple(n, k-1);
        System.out.println(n*k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

       multiple(n,k);
    }
}
