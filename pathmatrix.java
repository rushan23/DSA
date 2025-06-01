public class pathmatrix {
    public static int path(int i, int j, int m, int n) {
        if (i == m || j == n) {
            return 1;
        }
        int down = path(i + 1, j, m, n);
        int right = path(i, j + 1, m, n);
        return down + right;
    }

    public static void main(String[] args) {
        int m = 3; // Number of rows
        int n = 3; // Number of columns
        System.out.println("Number of unique paths: " + path(1,1,m,n));
    }
}
