package stack;

public class Stack {
		int head=0;
	
	Stack(int size){
		
		if(size==0)
			int [] stackArray = new int[10];
		else
			int [] stackArray = new int[size];
		
		stackArray[0]=head;
		head = stackArray[0];
	}
	
	public boolean isEmpty() {
		if(head == null)
			System.out.println("stack is empty");
		return true;
}
