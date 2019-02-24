package stack;

public class Stack {
	
	// 가장 위에 있는 stack
	int top, maxSize;
	
	Stack() {
		
	}

	public boolean isFull() {
		// 스택이 꽉 찬 경우, 가장 위에 있는 스택이 멕시멈보다 1작은 경우가 꽉찬 경
		if(top == maxSize -1) {
			return true;
		}else
			return false;
	}
}
