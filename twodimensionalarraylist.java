    import java.util.*;
public class twodimensionalarraylist {



    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Add 3 rows
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // Fill data
        int num = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(num++);
            }
        }

        // Print the 2D ArrayList
        for (ArrayList<Integer> row : list) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
// multiplication in 2 d array see on chat gpt

