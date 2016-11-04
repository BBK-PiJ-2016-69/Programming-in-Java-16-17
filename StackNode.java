public class StackNode<T extends Number>{
	private StackNode<T> prev = null;
	private StackNode<T> next = null;
	private T data;

	public StackNode(T data){
		this.data = data;
	}
	public StackNode<T> next(){
		return this.next;
	}

	public StackNode<T> prev(){
		return this.prev;
	}

	public T get(){
		return this.data;
	}

	public void setPrev(StackNode<T> node){
		this.prev = node;
	}

	public void setNext(StackNode<T> node){
		this.next = node;
	}


}