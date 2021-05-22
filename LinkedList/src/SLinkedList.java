class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
		}
	}
public class SLinkedList {
	
	
	
	
	public Node head=null;
	public Node tail=null;
	
	public void addNode(int data) {
		Node newNode=new Node(data);
		
		if(head==null)
		{
			head=newNode;
			
		}else {
			tail.next=newNode;
		}
		tail=newNode;
	}
	
	public void display() {
		if(head==null)
		{
			System.out.println("empty");
			return;
		}
		
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public void delete(int data)
	{
		
		Node temp=head,pre=null;
		if(temp!=null&&temp.data==data)
		{
			head=temp.next;
			return;
		}
		while(temp!=null&&temp.data!=data)
		{
			pre=temp;
			temp=temp.next;
			
			
		}
		if(temp==null) {
			return;
		}
		if(temp==tail)
		{
			
			tail=pre;
			
			tail.next=null;
			return;
		}
		pre.next=temp.next;
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
		if(temp==tail)
		{
			tail.next=newNode;
			tail=newNode;
			
			System.out.println(temp.data);
			return;
		}
		
		newNode.next=temp.next;
		temp.next=newNode;
		System.out.println(tail.data+" "+temp.data);
	}
	public void removeDuplicate()
	{
		Node current=head;
		
		while(current!=null)
		{
			Node Next=current.next;
			
		while(Next!=null&&current.data==Next.data)
		{
			Next=Next.next;
			
		}
		current.next=Next;
		if(Next==tail)
		{
			tail=current;
		}
		
		current=Next;
		}
	}
	
	public static void main(String arg[])
	{
		SLinkedList list=new SLinkedList();
		
		list.addNode(10);
		list.addNode(20);
		
		list.addNode(30);
		list.addNode(30);
		list.addNode(40);
		
		list.removeDuplicate();
		list.display();
		
		
	}

}
