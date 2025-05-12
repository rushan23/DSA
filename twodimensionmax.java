
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
    }

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
}
    }
