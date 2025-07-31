package arr;

public class mergetwosortedarrays {

    public static void main(String[] args) {
        int a[] = {1, 23, 35, 45, 55};
        int b[] = {1, 22, 32, 44, 53};
        int c[] = new int[a.length + b.length];

        int n = a.length;
        int z = b.length;
        int i = 0, j = 0, k = 0;

        // Merge until one array finishes
        while (i < n && j < z) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of a[]
        while (i < n) {
            c[k] = a[i];
            i++;
            k++;
        }

        // Copy remaining elements of b[]
        while (j < z) {
            c[k] = b[j];
            j++;
            k++;
        }

        // Print merged sorted array
        for (int x : c) {
            System.out.print(x + " ");
        }
    }
}
