public class Stack {
	private int stackSize = 0;
	private StackItem firstItem = null;
	private StackItem lastItem = null;

	public static void main(String[] args){
		Stack myStack = new Stack();
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);

		myStack.printAll();

		System.out.println("Stack is empty? "+myStack.empty());

		System.out.println(">>" + myStack.pop());
		System.out.println(">>" + myStack.pop());
		System.out.println(">>" + myStack.pop());

		System.out.println("Stack is empty? "+myStack.empty());


	}


	public void push (int storedNumber){
		StackItem newItem = new StackItem(storedNumber);
		if(firstItem == null){
			this.firstItem = newItem;
			this.lastItem = newItem;
		}
		else
		{
			firstItem.previousItem = newItem;
			newItem.nextItem = firstItem;
			firstItem = newItem;
		}

		this.stackSize++;
		
	}

	public int pop (){
		if(firstItem == null){
			System.out.println("Queue is currently empty");
			return 0;
		}
		else
		{
			this.stackSize--;
			int storedNumber = firstItem.storedNumber;

			if(firstItem.nextItem != null){
				firstItem.nextItem.previousItem = null;
				firstItem = firstItem.nextItem;
			}
			else
			{
				firstItem = null;
				lastItem = null;
			}

		return storedNumber;
		}
	}

	public boolean empty(){
		if(stackSize == 0){
			return true;
		}
		else
		{
			return false;
		}
	}

	public void printAll(){
		int i;
		StackItem current = firstItem; 
		for(i=0; i<stackSize; i++){
			System.out.println(">"+current.getNumber());
			current = current.nextItem;
		}
	}

	


}