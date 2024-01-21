public class keypadCombinations {

    static void combination(String digit,String [] keypad,String result){   // "245" --> keypad[2]
        if (digit.length() == 0 ){                                           //  time complexity = O( n * 4^n )
            System.out.print(result + " ");
            return;
        }
        int currNum = digit.charAt(0) -'0'; // 2
        String currChoice = keypad[currNum];  // "abc"

        for (int i = 0; i < currChoice.length();i++){
            combination(digit.substring(1), keypad,result + currChoice.charAt(i));
        }
    }
    public static void main(String[] args) {
        String s = "5226";
        String[] keypad = {"" , "" , "abc" ,"def" , "ghi" , "jkl" , "mno" , "pqrs" , "uvw" , "xyz" };
                    //      0    1     2      3       4       5       6        7       8       9
     combination(s,keypad,"");
    }
}
