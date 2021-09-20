class Node2{
	int key;
	Node left;
	Node right;
	
	void Node2(int item){
		key=item;
		left=right=null;
	}
}
class Fullbtree{
	Node root;
	
	boolean isfullbtree(Node node){
		if(node==null)
			return true;
		if((node.left==null)&&(node.right==null))
			return true;
		if((node.left!=null)&&(node.right!=null))
			return(isfullbtree(node.left)&&isfullbtree(node.right));
		return false;
	}
	
	public static void main(String args[]){
	
		Fullbtree ft=new Fullbtree();
		ft.root=new Node(1);
		ft.root.left=new Node(2);
		ft.root.right=new Node(3);
		ft.root.left.left=new Node(4);
		ft.root.left.right=new Node(5);
		
		
	if(ft.isfullbtree(ft.root)){
		System.out.println("given tree is full btree");
	}else
	{
		System.out.println("give tree is not full btree");
	}
		
		
	}
}