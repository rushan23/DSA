import java.util.Scanner;

public class pathinmatrix {
    public  static int maze(int i,int j,int m,int n){
        if(i==m || j==n){
            return 1;
        }
        int down=maze( i, j+1,m,n);
        int right=maze( i+1, j,m,n);
        return down + right;
    }
    //   public  static int maze(int m,int n){
    //     if(m==1 || n==1){
    //         return 1;
    //     }
    //     int down=maze(m-1,n);
    //     int right=maze(m,n-1);
    //     return down + right;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int m = sc.nextInt();
        System.out.println(maze(1,1,m,n));
    }
    
}
