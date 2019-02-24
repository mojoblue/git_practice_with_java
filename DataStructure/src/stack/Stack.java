package stack;

public class Stack {
		int top=0;//처음 객체 선언하면 아무것도 없기에 top은 0이다.
		
	Stack(){//객체를 선언하는 순간 파라미터를 지정하지 않으면 dafault로 사이즈 10 배열을 선언하고 배열의 0번째 방을 탑으로 지정해놓는다.

		int [] stackArray = new int[10];
		stackArray[0]=top;
		top = stackArray[0];
	}
	Stack(int size){//파라미터를 지정했을 때.
	
			int [] stackArray = new int[size];
		
		stackArray[0]=top;
		top = stackArray[0];
	}
	public int search(int data)//data값에 맞는 배열 방 (index)을 찾아 리턴한다.
	{
		int count = top;
		if(top!=0)
			while(stackArray[count]!=data)
			{
				count--;
			}
		return count;
	}
	
	public boolean isEmpty() {
		if(head == null)
			System.out.println("stack is empty");
		return true;
}
