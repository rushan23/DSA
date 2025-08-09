package str;

public class maximumnuminstring {
    public static void main(String[] args) {
        String [] a={"12", "34", "56", "78", "90"};
        int max=0;
        for (int i=0;i<a.length;i++){
            int num=Integer.parseInt(a[i]);
            if(num>max){
                max=num;

            }

        }
        System.err.println(max);
    }
}
