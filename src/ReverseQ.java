import java.util.*;

public class ReverseQ {
    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty())
            stack.push(queue.remove());
        while (!stack.isEmpty())
            queue.add(stack.pop());
    }

    public static void main(String args[]) {
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(56);
        queue.add(27);
        queue.add(30);
        queue.add(45);
//        queue.add(85);
//        queue.add(92);
//        queue.add(58);
//        queue.add(80);
//        queue.add(90);
//        queue.add(100);
        reverse(queue);
        System.out.println(queue);
    }
}

