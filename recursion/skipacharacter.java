package recursion;

public class skipacharacter {
    public static void main(String[] args) {
        int i = 0;
        String n = "hello how are you";
        arrays(i, n);
    }

    public static void arrays(int i, String n) {
        if (i == n.length()) {
            return;
        }
        if (n.charAt(i) == 'l') {
            arrays(i + 1, n); // skip 'l'
        } else {
            System.out.print(n.charAt(i)); // print other characters
            arrays(i + 1, n);
        }
    }
}
