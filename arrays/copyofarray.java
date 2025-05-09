package array;


public class copyofarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        for(int ele :arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        // int[] brr=arr;//shallow copy
        // brr[0]=10;
        // System.out.println(arr[0]);

        // int[] x=Arrays.copyOf(arr,arr.length);//deepcopy
        // x[2]=20;
        // for(int ele :x){
        //     System.out.println(ele+" ");
        // }
        int[]y=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            y[i]=arr[i];
             System.out.print(" "+y[i]);
        }
  
    }
}
