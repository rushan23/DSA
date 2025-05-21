import java.util.Arrays;

public class stringexample {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Original String: " + str);

        // Print characters with their index
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println("Character at index " + i + ": " + ch);
        }

        // Print all possible substrings
        System.out.println("\nAll Substrings:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.print(str.substring(i, j) + "  ");
            }
        }

        // Sort characters
        System.out.println("\n\nSorted characters:");
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for (char ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
