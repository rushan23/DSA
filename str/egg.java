package str;

public class egg {
    public static void main(String[] args) {
        String s="hello how are you";
        int count =0;
        char c=' ';
        for (int i = 0; i < s.length(); i++) {
            int tempcount = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i)==s.charAt(j)){
                    tempcount++;
                }
            }
            if(tempcount>count){
                count = tempcount;
                c=s.charAt(i);
            }
           
        }
         System.err.println(c+"number tumes "+count);
        
    }
}
