public class ListItem {
	public ListItem nextItem = null;	
	public ListItem previousItem = null;
	public int storedNumber;
	

	public ListItem(int storedNumber){
		this.storedNumber = storedNumber;
	}

	public int getNumber(){
		return this.storedNumber;
	}

}