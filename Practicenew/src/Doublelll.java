import java.lang.*;
public class Doublelll {
	


	 
	Node head;

	class Node{
		int data;
		Node next;
		Node prev;


		Node(int d){
			data=d;
		}
	}
	 public void insertfront(int data){
		 Node newnode=new Node(data);

		 newnode.next=head;
		 newnode.prev=null;

		 if(head!=null){
			 head.prev=newnode;
			 head=newnode;
		 }
	 }

	 public void insertafter(Node prevnode, int data){

		 if(prevnode==null){
			 System.out.println("prevnode cannot be null");
			 return;
		 }


		 Node newnode=new Node(data);

		 newnode.next=prevnode.next;

		 prevnode.next=newnode;
		 newnode.prev=prevnode;

		 if(newnode.next!=null)
			 newnode.next.prev=newnode;
	 }

	 public void insertend(int data){

		 Node newnode=new Node(data);

		 Node temp=head;

		 newnode.next=null;

		 if(head==null){
			 newnode.prev=null;
			 head=newnode;
			 return;
		 }
		 while(temp.next!=null)

			 temp=temp.next;
		 temp.next=newnode;
		 newnode.prev=temp;
	 }

	 public void delet(Node delnode){
		if(head==null||delnode==null)
			return;
		 if(head==delnode){
			 head=delnode.next;
		 }
		 if(delnode.next!=null){
			 delnode.next.prev=delnode.prev;
		 }
		 if(delnode.prev!=null){
			 delnode.prev.next=delnode.next;
		 }
		 }

	 public void printlist(Node node){
		 Node last = null;
		 while (node != null){
			 System.out.print(node.data+"->");
			 last=node;
			 node=node.next;
		 }
		 System.out.println();
	 }

		public static void main(String[] args) {

			Doublelll d1ll=new Doublelll();

			d1ll.insertend(4);
			d1ll.insertfront(3);
			d1ll.insertfront(2);
			d1ll.insertfront(1);
			d1ll.insertend(5);

			d1ll.insertafter(d1ll.head, 11);

			d1ll.insertafter(d1ll.head.next, 12);

			d1ll.printlist(d1ll.head);

			d1ll.delet(d1ll.head.next.next.next.next.next.next);

			d1ll.printlist(d1ll.head);
			// TODO Auto-generated method stub

		}

	}
	
