public class Main {
    public static void main(String[] args) {
        int x = 0;
        int  y = 1;
        for (int i=0; i<=18  ;i++){
       int z=x+y;
        y = x;
        x = z;
       System.out.println(z);
        
        }
    }
}

// c
// #include <stdio.h>

// int main() {
//     int prev2 = 0, prev1 = 1;
//     int newFibo;

//     for(int fibo = 0; fibo < 18; fibo++) {
//         newFibo = prev1 + prev2;
//         printf("%d\n", newFibo);
//         prev2 = prev1;
//         prev1 = newFibo;
//     }

//     return 0;
// }