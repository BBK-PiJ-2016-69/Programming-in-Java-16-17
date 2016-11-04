public class sortedPolyList<T extends Comparable<T>>{

	private ListNode<T> firstNode = null;
	private ListNode<T> lastNode = null;
	
	public void add(T data){
		ListNode<T> newNode = new ListNode<T>(data);

		if(firstNode == null){
			firstNode = newNode;
			lastNode = newNode;
		}

		else if(newNode.get().compareTo(firstNode.get()) < 0){
			// Add at beginning
			firstNode.setPrev(newNode);
			newNode.setNext(firstNode);
			firstNode = newNode;
		}
		else if(newNode.get().compareTo(lastNode.get()) > 0){
			lastNode.setNext(newNode);
			newNode.setPrev(lastNode);
			lastNode = newNode;
		}
		else
		{
			ListNode<T> currentNode = firstNode;
			while(currentNode.next()!=null){
				if(newNode.get().compareTo(currentNode.get()) < 0){
					currentNode.prev().setNext(newNode);
					newNode.setPrev(currentNode.prev());
					newNode.setNext(currentNode);
					currentNode.setPrev(newNode);
				}
				currentNode = currentNode.next();
			}
		}
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