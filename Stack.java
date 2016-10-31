public class Stack {
	private int stackSize = 0;
	private StackItem firstItem = null;
	private StackItem lastItem = null;

	public static void main(String[] args){
		Stack myStack = new Stack();
		myStack.insert(1);
		myStack.insert(2);
		myStack.insert(3);

		myStack.printAll();


	}


	public void insert (int storedNumber){
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

	public int retrieve (){
		
		return 0;
	}

	public int empty(){
		return 0;
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