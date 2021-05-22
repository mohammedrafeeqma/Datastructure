
public class Stacks {
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	public Node top;
	public void push(int data) {
		Node newNode=new Node(data);
	
		if(top==null)
		{
			top=newNode;
		}
		else {
			newNode.next=top;
			top=newNode;
		}
		
	}
	public void pop() {
		if(top==null)
		{
			System.out.println("Stack Overflow");
			return;
		}
		else {
			top=top.next;
		}
	}
	
	public void display() {
		Node temp=top;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public static void main(String args[]) {
		Stacks stack=new Stacks();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.pop();
		stack.display();
		
	}
	

}
