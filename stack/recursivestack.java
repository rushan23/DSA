
import java.util.Stack;

public class recursivestack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10); 
        stack.push(20); 
        stack.push(30); 
        stack.push(40);
        recursiverev(stack);
        System.out.println(stack); 
    }

    public static Stack<Integer> recursiverev(Stack<Integer> stack) {
    if (stack.isEmpty()) {
        return stack; // Base case: if the stack is empty, return it
    }
    int top=stack.pop();
    System.err.println(top);
    recursiverev(stack);
    stack.push(top); // Place the popped item at the bottom after recursion
    return stack;
    }
}
