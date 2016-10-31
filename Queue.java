public class Queue {
	private int queueSize = 0;
	private QueueItem firstItem = null;
	private QueueItem lastItem = null;

	public static void main(String[] args){
		Queue queueOne = new Queue();

		queueOne.insert(3);
		queueOne.insert(5);
		queueOne.insert(7);

		queueOne.printAll();
	}


	public void insert (int storedNumber){
		QueueItem newItem = new QueueItem(storedNumber);
		if(firstItem == null){
			this.firstItem = newItem;
			this.lastItem = newItem;
		}
		else
		{
			this.lastItem.nextItem = newItem;
			newItem.previousItem = lastItem;
			this.lastItem = newItem;
		}
		this.queueSize++;
		
	}

	public void printAll(){
		int i;
		QueueItem current = firstItem; 
		for(i=0; i<queueSize; i++){
			System.out.println(">"+current.getNumber());
			current = current.nextItem;
		}
	}

	


}