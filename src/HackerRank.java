import java.util.Scanner;

public class HackerRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        if (n %2 != 0){
//            System.out.println("weird");
//        }else if (n >20){
//            System.out.println("Not weird");
//        }else {
//            System.out.println("Not weird");
//        }
//        int i = sc.nextInt();
//        double d = sc.nextDouble();
//        sc.nextLine();
//        String s = sc.nextLine();
//
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);

        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-14s %03d\n", s1, x);
        }
        System.out.println("================================");
    }
}
