// class recursive{
//     public static int fact(int n){
//         if(n==0 || n==1){
//             return 1;
//         }
//         return n * fact(n-1);

//     }    public static void main(String[] args) {
//         int n=5;
     
//         System.err.println(fact(n));
//     }
// }
class Recursive {
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 20;
        System.out.println(fibonacci(n));  // Output: 5
    }
}