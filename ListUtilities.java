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

		List returnedList = new List();
		List returnedList2 = new List();

		returnedList = newOperation.bubbleSort(myList);
		returnedList.printAll();

		returnedList2 = newOperation.cocktailSort(myList);
		returnedList2.printAll();

	}
	
	static List bubbleSort(List list){
		int i = 0;
		int temp;
		boolean done = false;
		long startTime = System.nanoTime();
		long finishTime;
		
		while(done != true){
			done = true;
			ListItem currentItem = list.getFirstItem();

			while(currentItem.getNextItem() != null){
				if(currentItem.getNumber() > currentItem.getNextItem().getNumber()){
					temp = currentItem.getNumber();
					currentItem.setNumber(currentItem.getNextItem().getNumber());
					currentItem.getNextItem().setNumber(temp);
					done = false;
					}

				currentItem = currentItem.getNextItem();
			}
		}
		finishTime = System.nanoTime() - startTime;
		System.out.println("Bubble Sort took: "+ finishTime + " nano seconds");
	
		return list;
	}

	static List cocktailSort(List list){
		int i = 0;
		int temp = 0;
		boolean done = false;
		boolean loopForward = true;

		long startTime = System.nanoTime();
		long finishTime;
		
		while(done != true){
			done = true;
			
			if(loopForward == true){
				System.out.println("Forwards");
				ListItem currentItem = list.getFirstItem();
				while(currentItem.getNextItem() != null){
					if(currentItem.getNumber() > currentItem.getNextItem().getNumber()){
						temp = currentItem.getNumber();
						currentItem.setNumber(currentItem.getNextItem().getNumber());
						currentItem.getNextItem().setNumber(temp);
						temp = 0;
						done = false;
					}

					currentItem = currentItem.getNextItem();
				}

				loopForward = false;
			}

			else if(loopForward == false){
				System.out.println("Backwards");
				ListItem currentItem = list.getLastItem();
				while(currentItem.getPreviousItem() != null){
					if(currentItem.getNumber() > currentItem.getPreviousItem().getNumber()){
						temp = currentItem.getNumber();
						currentItem.setNumber(currentItem.getPreviousItem().getNumber());
						currentItem.getPreviousItem().setNumber(temp);
						temp = 0;
						done = false;
					}

					currentItem = currentItem.getPreviousItem();
				}

				loopForward = true;
			}

		}
		finishTime = System.nanoTime() - startTime;
		System.out.println("Cocktail Sort took: "+ finishTime + " nano seconds");
	
		return list;
	}
}