Package sort;
public class mergersort {
    public static void merger(int[] a,int[] b,int[] c){
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k]= a[i];
                i++;
            }
            else{
                c[k]=b[j];
                j++;
            }
            k++;
        }
            while(j<b.length){
                c[k]=b[j];
                j++;
                k++;
            }
            while(i<a.length){
                c[k]=a[i];
                i++;
                k++;
            }
    }
    public static void mergesort(int[] arr) {
     
        int n=arr.length;
        if(n==1) return;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        for(int i=0;i<n/2;i++){
            a[i]=arr[i];
        }
        for(int i=0;i<n-n/2;i++){
            b[i]=arr[i+n/2];
        }
        mergesort(a);
        mergesort(b);
        merger(a,b,arr);
    }
        public static void main(String[] args) {
        int[] arr={10,40,2,34,90,67,1,2,3};
        System.out.println("Before sorting:");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        mergesort(arr);
         for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
}
