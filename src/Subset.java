
 public class Subset {


    static boolean isSubsetSum(int set[], int n, int sum)
    {

        if (sum == 0)
            return true;
        if (n == 0)
            return false;


        if (set[n - 1] > sum)
            return isSubsetSum(set, n - 1, sum);


        return isSubsetSum(set, n - 1, sum) || isSubsetSum(set, n - 1, sum - set[n - 1]);
    }

    /* Driver code */
    public static void main(String args[])
    {
        int set[] = { 3, 34, 4, 12, 5, 2 };
        int sum = 16;
        int n = set.length;
       // System.out.println(n);
        //System.out.println(set[2]);
        if (isSubsetSum(set, n, sum) == true)
            System.out.println("Found a subset"
                    + " with given sum");
        else
            System.out.println("No subset with"
                    + " given sum");
    }
}
