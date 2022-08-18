import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {
    static int Search(int[] ar,int key){
        for(int i=0;i<ar.length-1;i++){
            if(ar[i]==key)
                return i;
            else
                return -1;
        }
       return -1;

    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int n=scan.nextInt();

        System.out.println("Enter the array elements:");
       int abc[]=new int[n];
       for(int i=0;i<n;i++){
           abc[i]=scan.nextInt();
       }
        System.out.println("Enter the key  u want to search:");
       int key=scan.nextInt();
       int res=Search(abc,key);
       if(res==-1)
           System.out.println("Element"+key +"is not found");
       else
           System.out.println("Element"+key+"is found at index"+res);
       // System.out.println("Element is found at index");

    }


}
