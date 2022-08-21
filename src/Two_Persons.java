import java.util.Scanner;

public class Two_Persons {
    public static boolean May_Be(int a,int a1, int b, int b1){
        int max=Integer.MAX_VALUE;
        while(a<max&&b<max){
            if(a==b)
                return true;
            a+=a1;
            b+=b1;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the initial location of P1");
        int p1=scan.nextInt();
        System.out.println("Enter the maximum jump of P1:");
        int j1=scan.nextInt();
        System.out.println("Enter the initial location of P2");
        int p2=scan.nextInt();
        System.out.println("Enter the maximum jump of P2:");
        int j2=scan.nextInt();
        System.out.println("Will they meet again?: " +May_Be(p1,j1,p2,j2));


    }
}
