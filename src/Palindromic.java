import java.util.Scanner;
import java.util.Stack;

public class Palindromic {
     static void check(String n){
         Stack<Character> st=new Stack<>();
         Stack<Character> sn=new Stack<>();
         char[] arr=n.toCharArray();
         if(arr.length!=0){
             for(int i=0;i<arr.length;i++){
                 st.push(arr[i]);
             }
             for(int i=0;i<arr.length;i++){
                 sn.push(arr[i]);
             }
         }
         System.out.println(st);
         System.out.println(sn);
         if(st.equals(sn)){
             System.out.println("Given string is palindromic");
         }
         else
             System.out.println("Not a palindromic string");


     }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=scan.nextLine();
        check(str);

    }
}
