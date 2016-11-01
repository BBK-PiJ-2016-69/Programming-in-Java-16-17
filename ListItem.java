public class ListItem {
	private ListItem nextItem = null;	
	private ListItem previousItem = null;
	private int storedNumber;
	

	public ListItem(int storedNumber){
		this.storedNumber = storedNumber;
	}

	public int getNumber(){
		return this.storedNumber;
	}

	public void setNumber(int setNumber){
		this.storedNumber = setNumber;
	}

	public ListItem getNextItem(){
		return this.nextItem;
	}

	public ListItem getPreviousItem(){
		return this.previousItem;
	}

	public void setPreviousItem(ListItem setTo){
		this.previousItem = setTo;
	}

	public void setNextItem(ListItem setTo){
		this.nextItem = setTo;
	}
}