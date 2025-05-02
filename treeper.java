public class treeper {
    public static class tree{
        int data ;
        tree left ;
        tree right;
        tree(int data){
            this.data =data;
            this.left=null;
            this.right=null;
        }

    }
    public static void  preorder(tree node){
        if (node==null){
            return ;
        }

            System.out.print(node.data+", ");
            preorder(node.left);
            preorder(node.right);
            
        
    }
     public static void main(String[] args) {
        tree root=new tree(12);
        tree nodea=new tree(1);
        tree nodeb=new tree(2);
        tree nodec=new tree(3);
        tree noded=new tree(4);
        tree nodee=new tree(5);

            root.left=nodea;
            root.right=nodeb;
            nodea.left=nodec;
            nodea.right=noded;
            nodeb.left=nodee;
            preorder(root);
         
     }
}
