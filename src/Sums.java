import java.util.Scanner;

class Sums{
    public static int sum(int n) {
        //write the logic here
        int sum=0;
        while(n!=0){
            int num= n%10;
            sum=sum+num;
            n/=10;

        }
        System.out.println("Sum of the digits of given number is:");
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println(sum(num));
    }
}
