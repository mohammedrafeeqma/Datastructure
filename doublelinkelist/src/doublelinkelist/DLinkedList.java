package doublelinkelist;

public class DLinkedList {
	class Node{
		int data;
		Node next;
		Node pre;
		Node(int data){
			this.data=data;
		}
	}
		public Node head=null;
		public Node tail=null;
		
		public void addNo(int data) {
			Node newNode=new Node(data);
			Node temp=head;
			
			if(head==null) {
				head=newNode;
				
				
			}
			else {
				
				tail.next=newNode;
				newNode.pre=tail;
				
				
			}
			System.out.println("node is added");
			tail=newNode;
			
		}
		public void delete(int data)
		{
			Node temp=head,pr=null;
			while(temp!=null&&temp.data!=data)
			{
				pr=temp;
				temp=temp.next;
			}
			if(temp==head)
			{
				head=temp.next;
				return;
			}
			if(temp==null) {
				return;
			}
			if(temp==tail)
			{
				tail=pr;
				tail.next=null;
				return;
				
			}
			
			pr.next=temp.next;
			temp.next.pre=pr;
			
			
		}
		public void insertAny(int key,int data)
		{
			Node newNode=new Node(data);
			Node temp=head;
			while(temp!=null&&temp.data!=key)
			{
				temp=temp.next;
			
			}
			if(temp==null)
			{
				return;
			}
			if(temp==head)
			{
				head=newNode;
				head.next=temp;
				temp.pre=head;
			}
			if(temp==tail)
			{
				
				tail.next=newNode;
				newNode.pre=temp;
				newNode.next=null;
				return;
			}
			newNode.next=temp.next;
			newNode.pre=temp;
			temp.next.pre=newNode;
			temp.next=newNode;
			
			
			
		}
		public void display() {
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
		public void displayRev() {
			Node temp=tail;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.pre;
			}
		}
	
	public static void main(String arg[]) {
		DLinkedList List=new DLinkedList();
		List.addNo(10);
		List.addNo(20);
		List.addNo(30);
		List.addNo(40);
		List.insertAny(20,90);
		List.display();
		
		
		
	}

}
