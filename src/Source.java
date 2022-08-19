import java.util.Scanner;

public class Source {
    // function to calculate base^exponent
    public static double powerfunc(double base, double power) {
        //write your code here
        double res=1;
       if(power==0)
           return 1;
       else if(power>0) {
           for (int i = 0; i < power; i++) {
               res = res * base;
           }
           return res;
       }
       else if(power<0) {
          // System.out.println(String.valueOf(power).substring(1));
           Double tem=Double.parseDouble(String.valueOf(power).substring(1));
          // System.out.println(tem);
           for (int i = 0; i < tem; i++) {
               res = (res * base);
           }
           return (1/res);
           //do {
//               res = res * base;
//               power++;
//           }
//           while (power!=  0) ;
//
//
//
//
//           return 1/res;
       }
           else{
            System.out.println("Enter a valid power:");

        }
       return -1;
    }
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Enter the base:");
        double a = inpt.nextDouble();
        System.out.println("Enter the power");
        double b = inpt.nextDouble();
        // printing the value of a^b i.e.,

        System.out.print( powerfunc(a, b));
    }

}
