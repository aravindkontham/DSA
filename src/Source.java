import java.util.Scanner;
class Source{
   public static void main(String[] args) {
       Scanner scan =new Scanner(System.in);
     System.out.println("Enter the natural number n:");
        int n =scan.nextInt();
       System.out.println("Sum of consequtive numbers is:"+addnumbers(n));
   }
     public static int addnumbers(int num){
        if(num!=0)
            return num+addnumbers(num-1);
            else
           return num;
    }
}


