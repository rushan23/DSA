package recursion;

public class arra {
    public static void main(String[] args) {
        int i=0;
        int[] n = {1,2,3,4,5,6,7,8,9};
        arrays(i,n);
    }
    public static void arrays(int i,int []n){
        if (i>n.length-1){
            return ;
        }
        System.err.println(n[i]);
        arrays(i+1,n);
    }
}
