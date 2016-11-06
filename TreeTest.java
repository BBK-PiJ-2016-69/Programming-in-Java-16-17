public class TreeTest{
	
	public static void main(String[] args){
		IntegerTreeNode itn1 = new IntegerTreeNode(5);
		itn1.add(7);
		itn1.add(3);
		itn1.add(4);
		itn1.add(17);
		itn1.add(5);
		itn1.add(2);
		itn1.add(-1);
		itn1.add(45);
		itn1.add(3);
		itn1.add(4);
		itn1.add(20);
		itn1.add(12);
		itn1.add(120);

		itn1.strAll(itn1);

		System.out.println("Min: "+itn1.getMin());
		System.out.println("Max: "+itn1.getMax());

	}
}