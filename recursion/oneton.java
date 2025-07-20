package recursion;

public class oneton {
    public static void main(String[] args) {
        int n=5;
         print( n);
    }
    public static int print (int n){
        if (n==0){
            return 0;}
     System.out.print(n+print(n-1));
    
            return n;
        }
    }

