import java.util.Scanner;

public class basicStringFunction {

    static String remove_char(String s , int idx){
        //base case
        if (idx == s.length() ) return " ";             //  time complexity = O(n^2)
        //recursive work
        String smallAns = remove_char(s,idx+1);
        //self work
        char currentChar = s.charAt(idx);
        if (currentChar != 'a' ){
            return currentChar + smallAns;
        }else {
            return smallAns;
        }
    }

    static String remove(String a ){
        //base case
        if(a.length() == 0) return "";                             //  time complexity = O(2n^2) --> O(n^2)
        //recursive work
        String small = remove(a.substring(1));
        char current = a.charAt(0);
        //self work
        if (current != 'b' ){
            return current + small;
        }else {
            return small;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        String a = sc.next(); // print first character from the line
//        System.out.println(a);

       // String ab = sc.nextLine();  //print all character on that line
//        System.out.println(ab);
      //  System.out.println(ab.substring(2,5)); // print all character between 2 and 5 (2 is inclusive and 5 is exclusive)

//        char ch = ab.charAt(0);  // print character at index 0
//        System.out.println(ch);

//        for (int i = 0; i < ab.length(); i++){
//            System.out.println(ab.charAt(i));       //print all separated characters
//        }
        /*
        student
        0123456

        n = 7 == array.length ;  index = 6;
         */

        // remove all character present in tha given string
//        String s = sc.nextLine();
       // System.out.println(remove_char(s, 0));

        String a = sc.nextLine();
        System.out.println(remove(a));
    }
}
