
import java.util.*;

public class Same_Steps {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int p1 = s.nextInt();
        int p2 = s.nextInt();
        int s1 = s.nextInt();
        int s2 = s.nextInt();
        twoPeopleMeet(p1, p2, s1, s2);
    }

    // Method to find whether two people meet after jumping for the same number of times
    static void twoPeopleMeet(int p1, int p2, int s1, int s2) {
        // Write your code here
        if(p1>p2 && s1>s2){
            int d=p1-p2;
            int j=s1-s2;{
                if(d%j==0)
                    System.out.println("They will meet after same number of steps:");

            }
        }
        if(p1<p2 && s1<s2){
            int d=p1-p2;
            int j=s1-s2;{
                if(d%j==0)
                    System.out.println("They will meet after same number of steps:");
            }
        }
        else
            System.out.println("They will not meet ");
    }
}

