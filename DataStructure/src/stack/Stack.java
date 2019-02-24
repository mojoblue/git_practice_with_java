package stack;

public class Stack {
	int top = 0;
  int [] stackArray;
  int size = 10;
	int count = 0;
  
	Stack(){
		stackArray = new int[10];
    for(int i=0; i<size; i++){
      stackArray[i] = null;
    }
	}
  
	Stack(int size){
    this.size = size;
		stackArray = new int[this.size];
    for(int i=0; i<this.size; i++){
      stackArray[i] = null;
    }
	}
  public boolean isEmpty() {
		if(top == null){
			System.out.println("stack is empty");
      return true;
    }
		return true;
  }
  
  public boolean isFull() {
		if(top == size-1) {
      System.out.println("stack is full");
			return true;
		}else
			return false;
	}
  
  public int peek() {
		if(isEmpty()) {
			return null;
		}
		return stackArray[top];
	}
  
	public int pop() {
		if(!isEmpty()) {
      int returnValue = stackArray[top];
      stackArray[top--] = null;
			return returnValue;
		}
		// If data is not exist, return null.
		else{
      return null;
    }
	}
  
  public void push(int data) {
		stackArray[++top] = data;
    count++;
    System.out.println(data+" is add to stack.");
	}
  
	public int search(int data)
	{
		if(count == 0){
			System.out.println("Can't find index (return null)");
      return null;
    }
    
	  for(int i=0; i<count; i++)
	  {
       if(stackArray[i] == data){
          count--;
       }
    }
		return count-1;
	}
}
