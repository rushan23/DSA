public class minimumarr {
    public static void main(String[] args) {
       int[]  arr={1,3,4,5,7,10};
        int min =arr[0];
        for(int i = 0 ; i<=arr.length - 1 ; i++){
            if(arr[i]<min){
                min=arr[i];
               
            }
        }
        System.out.println(min);
    }
}

// #include <stdio.h>


// int main() {
//     int my_array[] = {7, 12, 9, 4, 11};
//     int size = sizeof(my_array) / sizeof(my_array[0]);
//     int minVal = my_array[0];

//     for(int i = 0; i < size; i++) {
//         if(my_array[i] < minVal) {
//             minVal = my_array[i];
//         }
//     }

//     printf("Lowest value: %d\n", minVal);
//     return 0;
// }