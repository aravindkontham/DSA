import java.util.*;

public class Graded1 {
    static int dig[] = {1, 1, 2, 6, 4, 2, 2, 4, 2, 8};

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(lastNonZeroDigit(n));
    }

    // Method to find the last digit of n!
    static int lastNonZeroDigit(int n) {
        // Write your code here
        if (n < 10)
            return dig[n];

        // Check whether tens (or second last)
        // digit is odd or even
        // If n = 375, So n/10 = 37 and
        // (n/10)%10 = 7 Applying formula for
        // even and odd cases.
        if (((n / 10) % 10) % 2 == 0)
            return (6 * lastNonZeroDigit(n / 5)
                    * dig[n % 10]) % 10;
        else
            return (4 * lastNonZeroDigit(n / 5)
                    * dig[n % 10]) % 10;
    }

    // Driver code

    }


