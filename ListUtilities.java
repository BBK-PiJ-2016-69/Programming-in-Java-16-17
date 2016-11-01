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
		boolean done = false;
		int temp = 0;
		long startTime = System.nanoTime();
		long finishTime;
		
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
		finishTime = System.nanoTime() - startTime;
		System.out.println("Bubble Sort took: "+ finishTime + " nano seconds");
	
		return list;
	}

	static List cocktailSort(List list){
		int i = 0;
		boolean done = false;
		boolean loopForward = true;
		int temp = 0;
		long startTime = System.nanoTime();
		long finishTime;
		
		while(done != true){
			done = true;
			
			if(loopForward == true){
				System.out.println("Forwards");
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

				loopForward = false;
			}

			else if(loopForward == false){
				System.out.println("Backwards");
				ListItem currentItem = list.lastItem;
				while(currentItem.previousItem != null){
					if(currentItem.getNumber() > currentItem.previousItem.getNumber()){
						temp = currentItem.getNumber();
						currentItem.setNumber(currentItem.previousItem.getNumber());
						currentItem.previousItem.setNumber(temp);
						temp = 0;
						done = false;
					}

					currentItem = currentItem.previousItem;
				}

				loopForward = true;
			}

		}
		finishTime = System.nanoTime() - startTime;
		System.out.println("Cocktail Sort took: "+ finishTime + " nano seconds");
	
		return list;
	}
}