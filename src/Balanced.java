import java.util.Scanner;
import java.util.Stack;

public class Balanced {
    public static boolean fun(String n){
        Stack stack=new Stack();
        char[] arr=n.toCharArray();//typecasting
        for(int i=0;i<arr.length;i++) {
            char current = arr[i];
            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
                continue;
            }
            if (stack.isEmpty()){
                return false;
              }
        char popchar;
        switch (current){
            case ')':
                popchar=(char) stack.pop();
                if(popchar=='['|| popchar=='{')
                    return false;
                break;
            case '}':
                popchar=(char) stack.pop();
                if(popchar=='['|| popchar=='(')
                    return false;
                break;
            case ']':
                popchar=(char) stack.pop();
                if(popchar=='('|| popchar=='{')
                    return false;
                break;
        }
        }
        return (stack.isEmpty());


    }
    public static void main(String[] args) {
        String inputstr;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the characters:");
        inputstr=scan.nextLine();
        if(fun(inputstr))
            System.out.println("Given input is balanced");
        else
            System.out.println("Not balanced:");
    }
}
