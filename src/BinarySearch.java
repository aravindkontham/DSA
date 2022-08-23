public class BinarySearch {
    public static int binary(int arr[],int a,int z,int key){
        while(a<=z){
            int mid=(a+z)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                return binary(arr,a,mid-1,key);
            }
            else
                return binary(arr,mid+1,z,key);
        }
        return -1;

    }
    public static void main(String[] args) {
        BinarySearch binarySearch=new BinarySearch();
        int[] arr=new int[]{1,2,3,4,33,556,44};
        int n=arr.length;
        int key=3;
        int res=binarySearch.binary(arr,0,n-1,key);
        if(res==-1)
            System.out.println("Element is not found");
        else
            System.out.println("Element is found at index "+ res);
    }
}
