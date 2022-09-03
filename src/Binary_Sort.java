public class Binary_Sort {
    public static void main(String[] args) {
        int arr[]={23,34,12,34,56,78,11};
        int beg=0,last=arr.length-1,key=34;
        int loc=0;
        while(beg<=last){
         int mid=(beg+last)/2;
            if(arr[mid]==key){
                loc=mid;
                break;
            }
            else if(arr[mid]>key){
                last=mid-1;
            }
            else if(arr[mid]<key){
                beg=mid+1;
            }
        }
        if(loc!=-1)
            System.out.println("Element is found at index "+loc);
        else
            System.out.println("Element is not found:");

    }
}
