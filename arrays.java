
import java.util.Scanner;

class arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
             arr[i]=sc.nextInt();
            
        }
           for (int j = 0; j < arr.length; j++) {
            if(arr[j]<35){
             System.err.print(" "+arr[j] +"at index" + j );
                sc.close();
            }
        }
    }
}
