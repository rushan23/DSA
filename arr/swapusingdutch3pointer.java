package arr;

public class swapusingdutch3pointer {
    public static void main(String[] args) {
        
      int arr[]={1,0,1,1,0,1,0,1,0,2,1,0,1,0,1,2,2};
      int lo=0;
      int mid=0;
      int hi=arr.length-1;
        int n=arr.length;
         while (mid<=hi){
               if(arr[mid]==0){
                    int temp=arr[mid];
                    arr[mid]=arr[lo];
                    arr[lo]=temp;
                    mid++;
                    lo++;
                }
                else if(arr[mid]==1){
                    mid++;
                }
                else{
                    int temp=arr[mid];
                    arr[mid]=arr[hi];
                    arr[hi]=temp;
                    hi--;
                }
                }
            
             for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        }
       
    }

