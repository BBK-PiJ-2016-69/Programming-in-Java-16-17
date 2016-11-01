class ListUtilities{

	public static void main(String[] args){
		List myList = new List();
		myList.addItem(6);
		myList.addItem(1);
		myList.addItem(10);
		myList.addItem(3);
		myList.addItem(2);
		myList.addItem(50);
		myList.addItem(26);
		myList.addItem(3);
		myList.addItem(13);

		ListUtilities newOperation = new ListUtilities();

		myList = newOperation.bubbleSort(myList);

		myList.printAll();

	}
	
	static List bubbleSort(List list){
		int i = 0;
		boolean done = false;
		int temp = 0;
		
		while(done != true){
			done = true;
			ListItem currentItem = list.firstItem;

			while(currentItem.nextItem != null){
				if(currentItem.getNumber() > currentItem.nextItem.getNumber()){
					temp = currentItem.getNumber();
					currentItem.setNumber(currentItem.nextItem.getNumber());
					currentItem.nextItem.setNumber(temp);
					temp = 0;
					done = false;
					}

				currentItem = currentItem.nextItem;
			}
		}
	
		return list;
	}
}