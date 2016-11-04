class TestStack{
	
	public static void main(String[] args){

		numberStack<Integer> intStack = new numberStack<Integer>();
		numberStack<Double> doubleStack = new numberStack<Double>();

		intStack.push(1);
		intStack.push(3);
		intStack.push(2);
		intStack.push(9);

		doubleStack.push(1.3);
		doubleStack.push(9.2);
		doubleStack.push(1000.1);
		doubleStack.push(2.1);

		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());

		System.out.println(doubleStack.pop());
		System.out.println(doubleStack.pop());
		System.out.println(doubleStack.pop());
		System.out.println(doubleStack.pop());
	}
}