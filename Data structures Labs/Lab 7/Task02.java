class Node 
{
	Node left;
	Node right;
	int data;
	Node(int data) 
	{
		this.data = data;
		left = null;
		right = null;
	}
}
 class BinaryTree
{
	Node root;
	Node parent;
	BinaryTree(int key)
	{
		root = new Node(key); 
		parent = root;
	}
	BinaryTree() 
	{
		root = null;
	}
		public Node addData(int data,Node cur) 
			{ 
				if(cur==null)
					cur=new Node(data);
				else
				{
					if(data<=cur.data) 
					{
						cur.left=addData(data, cur.left);
					}
					if(data>cur.data)
					{
						cur.right=addData(data, cur.right);
					}
				}

				return cur;
			}	
		
		public static void preOrder(Node root) 
	    {
	        if (root != null) {
	        System.out.print(root.data+" ");
	        preOrder(root.left);
	        preOrder(root.right);
	        }
	    }
	//For Second
	 public static void postOrder(Node root) {
	        if (root != null) {
	        postOrder(root.left);
	        postOrder(root.right);
	        System.out.print(root.data+" ");
	        }
	 }
	//For Third
	public static void inOrder(Node root) {
	        if (root != null) {
	        inOrder(root.left);
	        System.out.print(root.data+" ");
	        inOrder(root.right);
	        }
	}
	//For Fourth
	    static int count = 0;
	    static int count1 = 0;
	    public static int height(Node root) {
	          // Write your code here.
	       if(root.left != null)
	        {
	            count++; 
	            height(root.left);
	             
	        }
	         if(root.right != null)
	        {
	              count1++;
	            height(root.right);
	             
	        }
	        if(count1>count1)
	        {
	            return(count1);
	        }
	        else
	        {
	            return(count1);
	        }
	        
	    }  
		public static void main(String[] args)  
		{
	// Test the main method by creating node for different multiple nodes with children
			BinaryTree bt = new BinaryTree(5);
			bt.addData(6,bt.parent);
            bt.addData(15,bt.parent);
            bt.addData(100,bt.parent);
            bt.addData(-24,bt.parent);
            bt.addData(4,bt.parent);
            bt.addData(3,bt.parent);
            bt.addData(124,bt.parent);
            
            System.out.println("PreOrder");
            bt.preOrder(bt.root);
            
            System.out.println("\nPostOrder");
            bt.postOrder(bt.root);
            
            System.out.println("\nInOrder");
            bt.inOrder(bt.root);
            
          System.out.print("\nHight : "+ bt.height(bt.root));
           
            
            
		}
	}