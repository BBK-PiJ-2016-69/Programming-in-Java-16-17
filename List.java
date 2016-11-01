public class List{

	public int listSize;
	private ListItem firstItem = null;
	private ListItem lastItem = null;


	public void addItem(int storedNumber){

		ListItem newItem = new ListItem(storedNumber);

		if(this.getFirstItem() == null){
			this.setFirstItem(newItem);
		}
		else
		{
			this.getLastItem().setNextItem(newItem);
			newItem.setPreviousItem(lastItem);
		}
		setLastItem(newItem);

		listSize++;

	}

	public void printAll(){
		int i;
		ListItem current = getFirstItem(); 
		for(i=0; i<listSize; i++){
			System.out.println(">"+current.getNumber());
			current = current.getNextItem();
		}
	}

	public ListItem getFirstItem(){
		return firstItem;
	}

	public ListItem getLastItem(){
		return lastItem;
	}

	public void setFirstItem(ListItem setTo){
		this.firstItem = setTo;
	}

	public void setLastItem(ListItem setTo){
		this.lastItem = setTo;
	}



}