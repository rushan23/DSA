public class arrayrecursion {
    public static void stri(int i,String s){
        if(i==s.length()){
            return ;
        }
        System.out.print(s.charAt(i));
        stri(i+1, s);
    }
   
    public static void arra(int i,int[]arr){
        if(i==arr.length){
            return ;}
            System.out.print(arr[i]);
            arra(i+1, arr);

        
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        String s="hello";
stri(0,s);
 System.out.println(" ");
        arra(0,arr);
   
    }
}
