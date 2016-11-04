public class polyList<T>{
	
	private ListNode<T> firstNode = null;
	private ListNode<T> lastNode = null;

	public void add(T data){
		ListNode<T> node = new ListNode<T>(data);
		
		if(firstNode == null){
			firstNode = node;
		}
		else
		{
			lastNode.setNext(node);
			node.setPrev(lastNode);
		}
		lastNode = node;
	}

	public void printAll(){
		ListNode<T> node = firstNode;

		while(node != lastNode){
			System.out.println(">" + node.get());
			node = node.next();
		}

		System.out.println(">" + lastNode.get());
	}



}