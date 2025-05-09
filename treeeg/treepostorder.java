public class treepostorder {
    
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
        public static void  postorder(tree node){
            if (node==null){
                return ;
            }
    
              
            postorder(node.left);
               
            postorder(node.right);
                System.out.print(node.data+", ");
            
        }
         public static void main(String[] args) {
            tree root=new tree(12);
            tree nodea=new tree(6);
            tree nodeb=new tree(12);
            tree nodec=new tree(6);
            tree noded=new tree(12);
            tree nodee=new tree(6);
    
                root.left=nodea;
                root.right=nodeb;
                nodea.left=nodec;
                nodea.right=noded;
                nodeb.left=nodee;
                postorder(root);
             
         }
    }
    

