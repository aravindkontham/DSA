import java.util.*;

public class Element {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = s.nextInt();
        System.out.println("Enter the elements:");
        while (n-- > 0)
            stack.push(s.nextInt());
        System.out.println(stack);
        printFifthElementFromEnd(stack);
    }

    // Method to print the fifth element from the top of the stack
    static void printFifthElementFromEnd(Stack<Integer> stack) {
        int n = stack.size();
        // If the stack doesn't have enough elements
        if (n < 5)
            System.out.println("There are not enough elements in the stack");
        else {
            for (int i = 0; i < n-5; i++){
                stack.pop();
            }
            System.out.println("Fifth element from the bottom is: "+stack.peek());
        }
    }
}

