package str;

public class maximumoccurancecharacter {
    public static void main(String[] args) {
        String s = "hello how are you";
        int count = 0;
        char max = ' ';

        for (int i = 0; i < s.length(); i++) {
            int tempcount = 0;

            // Count occurrences of s.charAt(i)
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    tempcount++;
                }
            }

            // Update max if found more occurrences
            if (tempcount > count) {  // ignoring spaces
                count = tempcount;
                max = s.charAt(i);
            }
        }

        System.out.println("Maximum Occurrence Character: " + max);
        System.out.println("Count: " + count);
    }
}
