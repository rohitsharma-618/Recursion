import java.util.Scanner;

public class multiply {
    static int multiplaction(int x,int y){
        if (x == 0 || y == 0){
            return 0;
        }
        else {
            return x*y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("multiply of " +x+ " & " +y+ " = "+multiplaction(x,y));
    }
}
