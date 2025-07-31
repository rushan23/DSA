package arr;

public class swapzerosandones {
    public static void main(String[] args) {
        int arr[]={1,0,1,1,0,1,0,1,0,2,1,0,1,0,1,2,2};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
