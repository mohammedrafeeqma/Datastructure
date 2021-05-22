
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
				
				tail=newNode;
				newNode.pre=tail;
				
			}
			tail=newNode;
			
		}
		public void display() {
			Node temp=head;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	
	public void main(String arg[]) {
		DLinkedList List=new DLinkedList();
		List.addNo(10);
		List.addNo(20);
		
		List.display();
		
		
	}

}
