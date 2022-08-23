import java.util.Scanner;

public class UserBinary {
    public static int Binary(int arr[],int beg,int end, int key) {
        int mid = (beg + end) / 2;
        while (beg <= end) {
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                return Binary(arr, mid + 1, end, key);
            else
                return Binary(arr, beg, mid - 1, key);
        }
        return -1;
    }
    public static void main(String[] args) {
        int beg=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=scan.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array elements:");
        for (int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter the key to search:");
        int key=scan.nextInt();
        int end=n-1;
        int res=Binary(arr,beg,end,key);
        if(res==-1)
            System.out.println("Element is not found");
        else
            System.out.println("Element is found at index "+ res);

    }
}
