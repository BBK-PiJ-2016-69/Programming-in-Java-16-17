public class StackItem {
	public StackItem nextItem = null;	
	public StackItem previousItem = null;
	public int storedNumber;
	

	public StackItem(int storedNumber){
		this.storedNumber = storedNumber;
	}

	public int getNumber(){
		return this.storedNumber;
	}

}