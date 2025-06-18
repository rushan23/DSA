public class selsction {
    public static void main(String[] args) {
        int[]arr={3,4,5,6,2,21};
        for (int i =0 ;i<arr.length-1;i++){
            int minindex=i;
            for (int j= i+1;j<=arr.length-1;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }

            }
            int temp = arr[i];  
            arr[i] = arr[minindex];
            arr[minindex] = temp;

        }
        for (int num=0;num<=arr.length -1;num++){
            System.out.println(arr[num]);
        }
    }
    
}
