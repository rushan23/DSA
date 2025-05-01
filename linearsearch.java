public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8, 9};
        int x = 9;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("Found at index " + i + " and the value is " + arr[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Value not found in the array.");
        }
    }
}
