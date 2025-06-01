class binarystringrec{
    public static void main(String[] args) {
        stringrec(3,"");
    }
    public static void stringrec(int n,String str){
        if(str.length()==n){
            System.err.println(str);
            return;
        }
        if(str.length()==0){
            stringrec(n,str+"1");
            stringrec(n,str+"0");
        }
        else if(str.charAt(str.length()-1)=='1'){
            stringrec(n,str+"0");
        }else
            {
                stringrec(n,str+"1");
                stringrec(n,str+"0");
            }
    }
}