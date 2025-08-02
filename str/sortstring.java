package str;

public class sortstring {
    public static void main(String[] args) {
        String s="hello";
        char [] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]>ch[j]){
                    char temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;

    }
            }
        }
        String sortedString = new String(ch);
        System.err.println("Sorted string: " + sortedString);
    }
}
