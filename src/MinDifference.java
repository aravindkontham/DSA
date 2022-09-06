import java.util.Arrays;
import java.util.Scanner;

public class MinDifference {
    int fun(int arr[],int n){
        Arrays.sort(arr);
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++) {
            if ((arr[i + 1] - arr[i]) < diff)
                diff = arr[i + 1] - arr[i];
        }

        return diff;

    }

    public static void main(String[] args) {
        MinDifference min=new MinDifference();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=scan.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("The min difference among the array is "+min.fun(arr,n) );

    }
}
