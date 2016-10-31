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

		System.out.println(queueOne.retrieve());
		System.out.println(queueOne.retrieve());
		System.out.println(queueOne.retrieve());
		System.out.println(queueOne.retrieve());

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

	public int retrieve (){
		
		if(firstItem == null){
			System.out.println("Queue is currently empty");
			return 0;
		}
		else
		{
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

	public void printAll(){
		int i;
		QueueItem current = firstItem; 
		for(i=0; i<queueSize; i++){
			System.out.println(">"+current.getNumber());
			current = current.nextItem;
		}
	}

	


}