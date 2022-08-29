import java.util.Scanner;

public class Prime {
    static boolean IsPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
               return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n=scan.nextInt();

        System.out.println(IsPrime(n));
    }
}
