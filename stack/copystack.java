    import java.util.Stack;

public class copystack {
;


    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        s.push(1);
          s.push(2);
            s.push(3);
              s.push(4);
              System.err.println(s);
             
              System.err.println( reverse(s,s2));
    }
    public static Stack<Integer> reverse(Stack<Integer> s,Stack<Integer> s2){
          Stack<Integer> G = new Stack<>();
        while(!s.isEmpty()){
            G.push(s.pop());
        }
          while(!G.isEmpty()){
            s2.push(G.pop());
        }
        return s2;
    }
}


