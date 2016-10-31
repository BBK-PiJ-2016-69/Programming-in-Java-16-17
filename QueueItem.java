public class QueueItem {
	public QueueItem nextItem = null;	
	public QueueItem previousItem = null;
	public int storedNumber;
	

	public QueueItem(int storedNumber){
		this.storedNumber = storedNumber;
	}

	public int getNumber(){
		return this.storedNumber;
	}

}