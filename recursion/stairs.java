package recursion;

public class stairs {
    public static void main(String[] args) {
        int n = 9;
        stair (n);
        System.err.println(stair (n));
    }
    public static int stair (int n){
        if (n<=2){
            return n;
        }
        return stair (n-1)+stair (n-2);
    }
}
