package str;

public class changeevencharacter {
    public static void main(String [] args){
    String str="hello hoe are you";
    int n=str.length();
    String s1="";
    for(int j=n-1;j>=0;j--){
        System.err.print(str.charAt(j));
    }
    for(int i=0;i<str.length();i++){
        if (i%2==0){
            s1 =s1+"a";


        }
        else{
            s1=s1+str.charAt(i);
        }
    }
    System.err.println();
    System.err.println(s1);
    }
}
