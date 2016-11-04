public class ListNode<T>{
	
	private ListNode<T> next = null;
	private ListNode<T> previous = null;
	private T value;

	public ListNode(T value){
		this.value = value;
	}

	public ListNode<T> next(){
		return this.next;
	}

	public ListNode<T> prev(){
		return this.previous;
	}

	public void setNext(ListNode<T> next){
		this.next = next;
	}

	public void setPrev(ListNode<T> prev){
		this.previous = prev;
	}

	public T get(){
		return this.value;
	}



}