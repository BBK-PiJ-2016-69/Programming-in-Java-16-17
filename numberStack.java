public class numberStack<T extends Number>{
	private StackNode<T> firstNode = null;
	

	public void push(T data){
		StackNode<T> newNode = new StackNode<T>(data);
		if(firstNode == null){
			firstNode = newNode;
		}
		else
		{
			firstNode.setPrev(newNode);
			newNode.setNext(firstNode);
			firstNode = newNode;
		}
		
	}

	public T pop(){
		T toReturn = firstNode.get();
		firstNode = firstNode.next();
		return toReturn;

	}

	public boolean isEmpty(){
		if(firstNode == null){
			return true;
		}
		else
		{
			return false;
		}
	}
}