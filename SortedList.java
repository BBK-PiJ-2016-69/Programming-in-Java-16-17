class SortedList {
	int listSize;
	ListItem firstItem = null;
	ListItem lastItem = null;



	public static void main(String[] args){
		SortedList mySort = new SortedList();
		mySort.addItem(1);
		mySort.addItem(9);
		mySort.addItem(3);

		mySort.printAll();

	}

	public void addItem(int storedNumber){
		int i;
		boolean added = false;

		ListItem newItem = new ListItem(storedNumber);


		if(firstItem == null){
			firstItem = newItem;
			lastItem = newItem;
		}
		else
		{
			// Add item
			
		}
		

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