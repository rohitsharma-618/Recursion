import java.util.Scanner;

public class reverseString {

    static boolean  palindrome(String b ,int f,int l){
//base case
        if (f >= l ) return true;
        //

        return( b.charAt(f) == b.charAt(l) && palindrome(b,f+1,l-1) );
    }

    static String reverse(String a ,int idx){
        //base case
        if (idx == a.length()) return "";                    //  time complexity = O(n^2)
        //recursive work
        String smallAns = reverse(a,idx+1);
        //self work

        return smallAns + a.charAt(idx) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  String a = sc.nextLine();
      //  System.out.println(reverse(a,0));

//        String rev = reverse(a,0);
//        if (rev.equals(a)){
//            System.out.printf(a+ " is Palindrome"); // it means that tha string and rev string are equal or not --> DAD == DAD
//        }else {
//            System.out.println(a+ "not Palindrome");
//        }
        String  b = sc.nextLine();
        System.out.println(palindrome(b,0,b.length()-1));
    }
}
// %a means that tha string that is entered by user