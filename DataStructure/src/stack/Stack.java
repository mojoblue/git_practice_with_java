package stack;

public class Stack {
	int top = 0;
  int [] stackArray;
  
	Stack(){
		stackArray = new int[10];
    for(int i=0; i<size; i++){
      stackArray[i] = null;
    }
	}
  
	Stack(int size){
		stackArray = new int[size];
    for(int i=0; i<size; i++){
      stackArray[i] = null;
    }
	}
  
	public int pop() {
		if(!isEmpty()) {
			return Stack[top--];
		}
		// If data is not exist, return null.
		else return null;		
	}
  
	public int search(int data)
	{
		int count = top;
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

