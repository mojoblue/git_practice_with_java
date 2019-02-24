package stack;

public class Stack {
	
	Stack() {
		
	}

	public int pop() {
		if(!isEmpty()) {
			return Stack[top--];
		}
		// data가 없을 때, null
		else return null;		
	}
}

