public class reversearray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        for( int ele:arr){
            System.err.print(ele);
        }
        // System.err.println();
    //     for(int i=0;i<arr.length/2;i++){
    //         int temp =arr[i];
    //         arr[i]=arr[arr.length-1-i];
    //         arr[arr.length-1-i]=temp;
    //     }
    //    for( int ele:arr){
    //         System.err.print(ele);
    //     }
    //     System.err.println();
          // for(int i=0;i<arr.length;i++){
    //     System.err.println(""+arr[arr.length-1-i]);//can use this too
    // }
    System.err.println();
    int left=0;
    int right =arr.length-1;
    while (left<=right){
        int temp =arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
    }
 for(int ele:arr){
    System.err.print(" "+ele);
 }
    }
  
}


