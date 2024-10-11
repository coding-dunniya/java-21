import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("push 1: " + stack.push(1));
        System.out.println("push 2: " + stack.push(2));
        System.out.println("push 3: " + stack.push(3));

        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());

        System.out.println("peek: " + stack.peek());

        System.out.println("size: " + stack.size());
    }
}
