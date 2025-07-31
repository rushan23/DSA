package arr;

public class copyarray {
 
    public static void main(String[] args) {
        int arr1[] = {10, 20, 30, 40, 50};
        int n = arr1.length;

        int arr2[] = new int[n]; // create new array of same size

        // copy elements
        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[i];
        }

        // print copied array
        System.out.print("Copied Array: ");
        for (int x : arr2) {
            System.out.print(x + " ");
        }
    }


}
