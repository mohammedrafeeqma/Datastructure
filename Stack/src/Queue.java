class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
public class Queue {
	public Node front;
	public Node rear;
	
	public void Enqueue(int data) {
		Node newNode=new Node(data);
		if(rear==null) {
			front=rear=newNode;
			return;
		}else {
			rear.next=newNode;
			rear=newNode;
		}
	}
	public void Dequeue() {
		if(front==null) {
			rear=null;
			return;
		}else {
			front=front.next;
		}
	}
	
	public void display() {
		Node current=front;
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
		}
	}
	
	public static void main(String args[]) {
		Queue queue=new Queue();
		queue.Enqueue(10);
		queue.Enqueue(20);
		queue.Enqueue(30);
		queue.Enqueue(40);
		queue.Dequeue();
		
		queue.display();
	}
}
