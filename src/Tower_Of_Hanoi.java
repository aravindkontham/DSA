import java.util.Scanner;

public class Tower_Of_Hanoi {
    public static void Hanoi(int n, String S,String H,String D){
        if (n==0){
            System.out.println("Enter at least 1 disc");
            return;
        }
        if(n==1){
            System.out.println("Transfer the disk "+n+" from "+S+" to " +D);
            return;
        }
        Hanoi(n-1,S,D,H);
        System.out.println("Move disk "+n+" from rod "+S+" to rod "+D);
        Hanoi(n-1,H,S,D);

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of discs:");
        int n=scan.nextInt();
        Hanoi(n,"S","H","D");

    }
}
