public class mapImplementation implements SimpleMap{
	
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

	public String get(int key){

		if(key == firstItem.getKey()){
			return firstItem.getName();
		}

		if(key==lastItem.getKey()){
			return lastItem.getName();
		}

		mapItem currentItem = firstItem;
		String name;

		while(currentItem.getNextItem() != null){
			
			if(currentItem.getKey() == key){
				return currentItem.getName();
			}
			currentItem = currentItem.getNextItem();
		}

		return currentItem.getName();
	}

	public void remove(int key){

		if(firstItem == lastItem && firstItem.getKey() == key){
			firstItem = null;
			lastItem = null;
		}
		else
		{
			if(firstItem.getKey() == key){
				firstItem.getNextItem().setPreviousItem(null);
				firstItem = firstItem.getNextItem();
			}
			else if (lastItem.getKey() == key){
				lastItem.getPreviousItem().setNextItem(null);
				lastItem = lastItem.getPreviousItem();
			}
			else {
				mapItem currentItem = firstItem;
				while (currentItem.getNextItem() != null){
					if(currentItem.getKey() == key){
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