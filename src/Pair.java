import java.util.HashMap;

public class Pair {
    public static void main(String[] args) {
        int arr[][]=new int[6][2];
        arr[0][0]=1;   arr[0][1]=7;
        arr[1][0]=4;   arr[1][1]=3;
        arr[2][0]=3;   arr[2][1]=4;
        arr[3][0]=10;  arr[3][1]=12;
        arr[4][0]=12;  arr[4][1]=10;
        arr[5][0]=9;   arr[5][1]=9;
        Paired(arr);
        System.out.println(arr.length);
    }
    static void Paired(int arr[][]){
        HashMap<Integer, Integer>  map=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            int first=arr[i][0];
            int sec=arr[i][1];
            Integer val=map.get(sec);
            if(val!=null && val==first)
                System.out.println("("+sec+","+first+")");
            else
                map.put(first,sec);
        }
    }
}
