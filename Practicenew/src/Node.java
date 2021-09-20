class Node{
	int key;
	Node left;
	Node right;
	
	public Node(int item){
		key=item;
		left=right=null;
	}
	
}
class BinaryTree{
	Node root;
	BinaryTree(){
		root=null;
		
	}
	
void Inorder(Node node){
	if(node==null){
		return;
	}
	Inorder(node.left);
	System.out.print(node.key+" ");
	Inorder(node.right);
}

void Preorder(Node node){
	if(node==null){
		return;
	}
	System.out.print(node.key+" ");
	Preorder(node.left);
	Preorder(node.right);
}

void Postorder(Node node){
	if(node==null){
		return;
	}
	Postorder(node.left);
	Postorder(node.right);
	System.out.print(node.key+" ");
}

void Inorder(){
	Inorder(root);
}
void Preorder(){
	Preorder(root);
}
void Postorder(){
	Postorder(root);
}

public static void main(String args[]){
	
	BinaryTree bt=new BinaryTree();
	bt.root=new Node(1);
	bt.root.left=new Node(2);
	bt.root.right=new Node(3);
	bt.root.left.left=new Node(4);
	bt.root.left.right=new Node(5);
	
	
	
	System.out.println("Inorder");
	bt.Inorder();
	System.out.println("preorder");
	bt.Preorder();
	System.out.println("postorder");
	bt.Postorder();
}
}

