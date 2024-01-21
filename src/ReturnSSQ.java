import java.util.ArrayList;
import java.util.Scanner;

public class ReturnSSQ {

    static ArrayList<String> SSQ(String s) {
        ArrayList<String> ans = new ArrayList<>();

        //base case
        if (s.length() == 0) {
            ans.add(" ");
            return ans;
        }

        //recursion work
        char current = s.charAt(0);
        ArrayList<String> smallAns = SSQ(s.substring(1));

        //self work
        for (String ss : smallAns) {
            ans.add(ss);
            ans.add(current + ss);
        }
        return ans;
    }

    static void SSQ1(String a,String currAns) {
        if (a.length() == 0){
            System.out.println(currAns);                             //  time complexity = O(n)
        return;                                                      // space complexity = O(n^2)
        }
        char curr = a.charAt(0); //a
        String remainString = a.substring(1);       //  bc

        SSQ1(remainString, currAns+ curr);      //  bc, a   --> add curr
        SSQ1(remainString,currAns );       // bc , " " --> do not add curr
    }

    public static void main(String[] args) {
        ArrayList<String> ans = SSQ("abc");
        for (String ss : ans) {
            System.out.println(ss);
        }
        System.out.println("=============");
        SSQ1("abc", " ");
    }
}
