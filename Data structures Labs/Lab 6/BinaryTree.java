/*
name: shankar
section: B
lab: 06
*/
public class BinaryTree {

    /**
     * @param args the command line arguments
     */
    Node root = null;
    BinaryTree(int num){
        root = new Node(num);
    }
    public void addNode(int num, Node par){
        if(num<par.data){
            if(par.left != null)
            addNode(num, par.left);
            else
                par.left = new Node(num);
        }
        else{
           if(par.right != null)
            addNode(num, par.right);
           else
               par.right = new Node(num);
        }
    }
    public boolean searchData(int data, Node par){
        boolean found = true;
        if(data > par.data){
            if(par.right != null)
               found = searchData(data, par.right); 
            else found = false;
        }
        else if(data < par.data){
            if(par.left != null)
                found = searchData(data, par.left);
            else found = false;
        }
        
        return found;
    }
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(7);
        bt.addNode(4, bt.root);
        bt.addNode(5, bt.root);
        bt.addNode(9, bt.root);
        bt.addNode(1, bt.root);
        bt.addNode(11, bt.root);
        bt.addNode(14, bt.root);
        bt.addNode(50, bt.root);
        bt.inOrderPrint(bt.root);
        System.out.println();
        bt.preOrderPrint(bt.root);
        System.out.println();
        bt.postOrderPrint(bt.root);
        
        System.out.println("\n"+bt.searchData(9, bt.root));
        System.out.println(bt.searchData(11, bt.root));
        System.out.println(bt.searchData(50, bt.root));
        System.out.println(bt.searchData(567, bt.root));
        System.out.println("Height: " + bt.height(bt.root));
    }
    public void inOrderPrint(Node par){
        if(par.left != null)
            inOrderPrint(par.left);
        System.out.print(par.data + " ");
        if(par.right != null){
            inOrderPrint(par.right);
        }
    }
    public void postOrderPrint(Node par){
        if(par.left != null)
            postOrderPrint(par.left);
        if(par.right != null){
            postOrderPrint(par.right);
        }
        System.out.print(par.data + " ");
    }
    public void preOrderPrint(Node par){
        System.out.print(par.data + " ");
        if(par.left != null)
            preOrderPrint(par.left);
        if(par.right != null){
            preOrderPrint(par.right);
        }
        
    }
    public int height(Node par){
        if(par != null){
        int l = 1 + height(par.left);
        int r = 1 + height(par.right);
        if(l > r)
            return l;
        else
            return r;
        }
        else return 0;
    }
}
class Node{
    int data = 0;
    Node left = null;
    Node right = null;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
