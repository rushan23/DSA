public class sortOnesTwoZero {
    public static void main(String[] args) {
        int[] arr={0,1,2,0,1,2,0,1,2};
        int n=arr.length;
        int l=0;
        int mid=0;
        while (mid<=n-1){
            if(arr[mid]==0){
                int temp =arr[mid];
                arr [mid]=arr[l];
                arr[l]=temp;
                mid++;
                l++;
                }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp =arr[mid];
                arr [mid]=arr[n-1];
                arr[n-1]=temp;
                n--;
            }
            
        }
        for(int ele:arr){
            System.err.print(" "+ele);
        }
    }
    
}
