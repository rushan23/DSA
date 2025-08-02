package str;

public class substring {
    public static void main(String[] args) {
        String str = "hello how";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.err.println(str.substring(i, j));
            }
        }
      
        int n=1234;
        String s1= n+""; 
        System.err.println(s1.length()); // prints "23"}
        String s3="hello";
        String s4=s3.substring(0,2)+"y"+s3.substring(3);
        System.err.println(s4);
}
}