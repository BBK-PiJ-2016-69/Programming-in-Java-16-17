public class multiMapImplementation implements SimpleMap2{
	
	private mapItem firstItem = null;
	private mapItem lastItem = null;

	public void put(int key, String name){

		mapItem newMapItem = new mapItem(key,name);

		if(firstItem == null){
			firstItem = newMapItem;
		}
		else
		{
			mapItem currentItem = firstItem;
			while(currentItem.getNextItem()!=null){
				currentItem = currentItem.getNextItem();
			}
			currentItem.setNextItem(newMapItem);
			newMapItem.setPreviousItem(currentItem);
		}

		lastItem = newMapItem;

	}

	public String[] get(int key){
		int i = 0;
		int j = 0;

		mapItem currentItem = firstItem;
		String name;

		while(currentItem.getNextItem() != null){
			
			if(currentItem.getKey() == key){
				i++;
			}

			currentItem = currentItem.getNextItem();
		}

		if(currentItem.getKey() == key){
			i++;
		}

		String[] returnArray = new String[i];

		currentItem = firstItem;

		while(currentItem.getNextItem() != null){
			
			if(currentItem.getKey() == key){
				returnArray[j] = currentItem.getName();
				j++;			
			}

			currentItem = currentItem.getNextItem();
		}

		if(currentItem.getKey() == key){
			returnArray[j] = currentItem.getName();
		}
		
		return returnArray;
	}

	public void remove(int key, String name){

		if(firstItem == lastItem && firstItem.getKey() == key && firstItem.getName() == name){
			firstItem = null;
			lastItem = null;
		}
		else
		{
			if(firstItem.getKey() == key && firstItem.getName() == name){
				firstItem.getNextItem().setPreviousItem(null);
				firstItem = firstItem.getNextItem();
			}
			else if (lastItem.getKey() == key && lastItem.getName() == name){
				lastItem.getPreviousItem().setNextItem(null);
				lastItem = lastItem.getPreviousItem();
			}
			else {
				mapItem currentItem = firstItem;
				while (currentItem.getNextItem() != null){
					if(currentItem.getKey() == key && currentItem.getName() == name){
						currentItem.getPreviousItem().setNextItem(currentItem.getNextItem());
						currentItem.getNextItem().setPreviousItem(currentItem.getPreviousItem());
					}
				}

			}
		}

	}

	public boolean isEmpty(){
		if(firstItem == null){
			return true;
		}
		return false;
	}

	

}