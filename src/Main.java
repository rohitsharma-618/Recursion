import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n  = sc.nextInt();
     for (int i = 1 ; i <= 10; i++){
         System.out.println( n+ " * " +i+ " = " +n*i);
//         System.out.print(n*i);
     }
    }
}
/* recursion :- ~ A function calling itself with different parameters
                & a base case to terminate the infinite loop

                ~ In recursion, we solve a bigger problem by solving a smaller sub-problem.
                ~ A function calls itself to solve its sub-problem.

                --> Functions :- Problems -- PI(n)
                                 sub=problem -- PI(n-1)
 */

/*
 the recursion spell :-
                      1. identify the smaller problem --> let recursion solve it.
                      2. self work --> do your work.
                      3. identify the base case --> smaller problem for which the answer is obtains.

             *** Note -> which one is first ? recursive work / self work... ***
 */
/*
       ** time complexity = no. of recursive calls * time taken in one cell
       ** sum of GP  = a(2^n -1) / r - 1

 */