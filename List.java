public class List{

	public int listSize;
	public ListItem firstItem = null;
	public ListItem lastItem = null;


	public void addItem(int storedNumber){

		ListItem newItem = new ListItem(storedNumber);

		if(firstItem == null){
			firstItem = newItem;
		}
		else
		{
			lastItem.nextItem = newItem;
			newItem.previousItem = lastItem;
		}
		lastItem = newItem;

		listSize++;

	}

	public void printAll(){
		int i;
		ListItem current = firstItem; 
		for(i=0; i<listSize; i++){
			System.out.println(">"+current.getNumber());
			current = current.nextItem;
		}
	}



}