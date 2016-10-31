class SortedList {
	int listSize;
	ListItem firstItem = null;
	ListItem lastItem = null;



	public static void main(String[] args){
		SortedList mySort = new SortedList();
		mySort.addItem(1);
		mySort.addItem(3);
		mySort.addItem(9);
		mySort.addItem(2);
		mySort.addItem(7);

		mySort.printAll();

	}

	public void addItem(int storedNumber){
		int i = 0;
		boolean added = false;
		ListItem newItem = new ListItem(storedNumber);

		if(firstItem == null){
			firstItem = newItem;
			lastItem = newItem;
		}
		else
		{
			ListItem currentItem = firstItem;

			while(currentItem.nextItem != null){


				if(newItem.getNumber() < currentItem.getNumber()){

					newItem.nextItem = currentItem;
					newItem.previousItem = currentItem.previousItem;
					currentItem.previousItem.nextItem = newItem;
					currentItem.previousItem = newItem;
					if(currentItem == firstItem){

						firstItem = newItem;
					}
					added = true;
				}
				
					currentItem = currentItem.nextItem;
				
				i++;
			}

			if(added != true){
				if(lastItem.getNumber() > newItem.getNumber()){
					newItem.nextItem = lastItem;
					newItem.previousItem = lastItem.previousItem;
					lastItem.previousItem.nextItem = newItem;
					lastItem.previousItem = newItem;
				}
				else
				{
					lastItem.nextItem = newItem;
					newItem.previousItem = lastItem;
					lastItem = newItem;
				}
			}

			added = false;
			
		}
		listSize++;
		
	}
		


	public void printAll(){
		int i;
		ListItem current = firstItem; 
		while(current.nextItem != null){
			System.out.println(">"+current.getNumber());
			current = current.nextItem;
		}
		System.out.println(">"+current.getNumber());
	}
}