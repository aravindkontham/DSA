import java.util.Scanner;

public class Factorial {

public static int findfact(int a){
    if(a==0){
        return 1;
    }
    else
        return a*findfact(a-1);
}



    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number n:");
        int n=scan.nextInt();
        System.out.println("The factorial of given number : "+n+" is "+findfact(n));
    }
}
