import java.lang.String;
import java.util.Scanner;

public class Pattern {
    // function to print the required pattern
    public static String func(int n) {
        //write your code here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++)
               System.out.print("*");
            System.out.println();
        }
        return "True";
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integer n:");
        int n = in.nextInt();
        func(n);
    }

}
