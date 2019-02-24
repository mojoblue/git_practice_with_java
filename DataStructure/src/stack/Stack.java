package stack;

public class Stack {
	int top = 0;
	
	Stack(){
		int [] stackArray = new int[10];
		stackArray[0]=head;
		head = stackArray[0];
	}
	Stack(int size){
		
			int [] stackArray = new int[size];
		
		stackArray[0]=head;
		head = stackArray[0];
	}
	
	public boolean isEmpty() {
		if(head == null)
			System.out.println("stack is empty");
		return true;
	}
}
