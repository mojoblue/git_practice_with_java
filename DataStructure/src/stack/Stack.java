package stack;

public class Stack {
	int top = 0;
  int [] stackArray;
	Stack(){
    
  }
  
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
  
	public int search(int data)
	{
		int count = top;
		if(top!=0){
			while(stackArray[count]!=data)
			{
				count--;
			}
    }
    
		if(count ==-1){
			System.out.println("Can't find index (return -1)");
    }
    
		return count;
	}
}
