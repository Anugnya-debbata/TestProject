class Node3{
	int key;
	Node left;
	Node right;

	static  Node3 newnode(int k){
		Node3 node=new Node3();
		node.key=k;
		node.right=null;
		node.left=null;
		return node;
	}
	static int depth(Node node){
		int d=0;
		while(node!=null){
			d++;
			node=node.left;
		}
		return d;
		
	}

static boolean isperfectbtree(Node root, int d,int level){
	if(root==null)
		return true;
	if((root.left==null)&&(root.right==null))
		return (d==level+1);
	if((root.left==null)||(root.right==null))
		return false;
	
	return isperfectbtree(root.left,d,level+1)&&isperfectbtree(root.right,d,level+1);
		
}

static boolean isPerfect(Node root){
	int d=depth(root);
	return isperfectbtree(root,d,0);
}

public static void main(String args[]){
	Node root=null;
	root=new Node(1);
	root.left=new Node(2);
	root.right=new Node(3);
	root.left.left=new Node(4);
	
	
	if(isPerfect(root)==true){
		System.out.println(" given tree is a perfect b tree");
	}
	else
	{
		System.out.println("given tree is not a perfect b tree");
	}
	
	
	
}

}