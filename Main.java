public class Main {
    public static void main(String[] args) {
        int x = 0;
        int  y = 1;
        for (int i=0; i<=18  ;i++){
       int z=x+y;
        y = x;
        x = z;
       System.out.println(z);
        
        }
    }
}
