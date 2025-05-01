public class binarysearch {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 6, 7, 8, 9, 10};
        int x = 10;
        int left = 0;
        int right = arr.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                System.out.println("Found at index " + mid + " and the value is " + arr[mid]);
                found = true;
                break;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Value not found in the array.");
        }
    }
}

