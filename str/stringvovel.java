package str;

import java.util.Scanner;

public class stringvovel {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        System.err.println(str.charAt(1));
        int count =0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
               ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                count++;
        }

       
}
String s22=" good morning";

 System.out.println(count);
        sc.close();
        System.err.println(str.indexOf('a'));
            System.err.println(str.lastIndexOf('a'));
            System.err.println(str.contains("hello"));
            System.err.println(str.startsWith("hel"));
             System.err.println(str.concat(s22));
              System.err.println(s22.substring(2,5));
               System.err.println(s22.substring(2));
    }
    }

        
