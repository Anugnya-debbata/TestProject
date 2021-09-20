public class Node1{
	int key;
	Node left;
	Node right;
	
	void Node1(int item){
		key=item;
		left=right=null;
		
	}
}
class Tree{
	Node root;
	
	 Tree(int key){
		 root=new Node(key);
		
	}
	 Tree()
	 {
		 root=null;
	 }
void Inorder(Node node){
	if(node==null){
		return;
	}
	
	Inorder(node.left);
	System.out.println(" "+node.key+" ");
	Inorder(node.right);
}

void Preorder(Node node){
	if(node==null){
		return;
	}
	System.out.println(" "+node.key+" ");
	Preorder(node.left);
	Preorder(node.right);
}

void Postorder(Node node){
	if(node==null){
		return;
	}
	
	Postorder(node.left);
	Postorder(node.right);
	System.out.println(" "+node.key+" ");
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
	Tree t=new Tree();
	t.root=new Node(1);
	t.root.left=new Node(2);
	t.root.right=new Node(3);
	
	System.out.println("inorder traversal");
	t.Inorder();
	System.out.println("Preorder traversal");
	t.Preorder();
	System.out.println("Postorder traversal");
	t.Postorder();
}

}