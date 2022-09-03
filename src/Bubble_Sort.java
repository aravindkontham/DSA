

import java.util.Arrays;

public class Bubble_Sort {
    static void Sort(int arr[],int n){
        if(n==1)
            return;
        int count=0;
        for(int i=0;i<n-1;i++) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                count = count + 1;
            }
        }
        if (count == 0)
            return;
        Sort(arr, n - 1);
    }
    public static void main(String[] args) {
        int arr[]={23,43,56,76,21,42,1,2};
        Sort(arr,arr.length);
        System.out.println("Sorted Array:");
//        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);


    }


}

