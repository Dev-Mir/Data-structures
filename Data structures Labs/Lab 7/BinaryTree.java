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
	boolean flag = false;
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
		public boolean searchData(int data) 
			{	
				flag = false;
				if(parent!=null)
				{
					if(data == parent.data)
					{
						parent = root;
						flag = true;
					}
					else if(data<parent.data)
					{
						parent = parent.left;
						searchData(data);
					}
					else
					{
						parent = parent.right;
						searchData(data);
					}
				}
				parent = root;
					return flag;
			} 

		public static void main(String[] args)  
		{
	// Test the main method by creating node for different multiple nodes with children
			BinaryTree bt = new BinaryTree(5);
			bt.addData(6,bt.parent);
            bt.addData(15,bt.parent);
            bt.addData(100,bt.parent);
            bt.addData(-24,bt.parent);
            bt.addData(122,bt.parent);
            bt.addData(115,bt.parent);
            bt.addData(124,bt.parent);
            System.out.println("Given Data is in Tree? : "+bt.searchData(6));
            System.out.println("Given Data is in Tree? : "+bt.searchData(66));
		}
	}