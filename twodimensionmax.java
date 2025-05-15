
import java.util.Scanner;

public class twodimensionmax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][]arr=new int[3][3];
       int  max=arr[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j]=sc.nextInt();
                
            }
            
        }
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.err.print(" "+arr[i][j]);
            }
            System.err.println();
    }
//max min
    System.err.println("");
     for (int z = 0; z < 3; z++) {
            for (int j = 0; j < 3; j++) {
                if(arr[z][j]>max){
                    max=arr[z][j];
                }
            }

  
            }
              System.err.println(""+max);
        
        System.err.println("The maximum element in the 2D array is: " + max);
        sc.close();
        System.err.println();
//transpose matrix
        int m=arr.length;
        int n=arr[0].length;
          for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.err.print(" "+arr[i][j]);
            }
            System.err.println();

}
System.err.println();
//90 degree rotate
for (int i = 0; i < n; i++) {
        for (int j = 0; j < n/2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[n - j - 1][i];
                arr[n - j - 1][i] = temp;
            }
            }
             for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.err.print(" "+arr[i][j]);
            }
            System.err.println();
             

    }
    // wave zig zag
System.err.println();
int z = arr.length;        // number of rows
int y = arr[0].length;     // number of columns

for (int i = 0; i < z; i++) {
    if (i % 2 == 0) {
        // even row: left to right
        for (int j = 0; j < y; j++) {
            System.out.print(arr[i][j] + " ");
        }
    } else {
        // odd row: right to left
        for (int j = y - 1; j >= 0; j--) {
            System.out.print(arr[i][j] + " ");
        }
    }
}
}
}
