package stackexamples;
import java.util.LinkedList;
import java.util.Queue;

public class queue {
       public static void main(String[] args) {
         Queue<Integer> s = new LinkedList<>();

        s.add(10);
        s.add(20);
        s.add(30);
System.out.println(s);
System.out.println(s.peek());
System.out.println(s.remove());
System.out.println(s.isEmpty());

    }
}


