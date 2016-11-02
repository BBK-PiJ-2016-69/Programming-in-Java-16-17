public class mapItem{
	
	private int key;
	private String name;
	private mapItem nextItem = null;
	private mapItem previousItem=null;

	public mapItem(int key, String name){
		this.key = key;
		this.name = name;
	}

	public void setNextItem(mapItem nextItem){
		this.nextItem = nextItem;
	}

	public void setPreviousItem(mapItem previousItem){
		this.previousItem = previousItem;
	}

	public mapItem getNextItem(){
		return this.nextItem;
	}

	public mapItem getPreviousItem(){
		return this.previousItem;
	}

	public String getName(){
		return this.name;
	}

	public int getKey(){
		return this.key;
	}



}