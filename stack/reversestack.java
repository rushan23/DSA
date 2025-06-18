import java.util.Stack;

public class reversestack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
          s.push(2);
            s.push(3);
              s.push(4);
              System.err.println(s);
             
              System.err.println( reverse(s));
    }
    public static Stack<Integer> reverse(Stack<Integer> s){
          Stack<Integer> G = new Stack<>();
        while(!s.isEmpty()){
            G.push(s.pop());
        
            

                
        }
        return G;
    }
}
