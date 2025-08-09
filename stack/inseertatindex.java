import java.util.Stack;

public class inseertatindex {
    public static void main(String[] args) {
         Stack<Integer> stack = new Stack<>();
         Stack<Integer> temp = new Stack<>();
            int index=2;
        stack.push(10); 
        stack.push(20); 
        stack.push(30); 
        stack.push(40);
            System.out.println("Stack after insertion: " + stack);
        while(stack.size() > index) {
            temp.push(stack.pop());
            
        }
        stack.push(99);
        while(!temp.isEmpty()) {
            stack.push(temp.pop());
        }
        System.out.println("Stack after insertion: " + stack);
    }
}
