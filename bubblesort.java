public class bubblesort {
    public static void main(String[] args) {
        int[]arr={3,5,67,3,2,3};
        for (int i =0;i<arr.length - 1;i++){
            for (int j =0;j<arr.length -1 - i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] =  temp;
                }
            }
        }
     for (int num=0;num<=arr.length -1;num++){
         System.out.println(arr[num]);
     }
    }
}
