public class testPolyList{
	
	public static void main(String[] args){
		sortedPolyList<String> employees = new sortedPolyList<String>();
		sortedPolyList<Integer> insuranceNumbers = new sortedPolyList<Integer>();

		employees.add("Matthew");
		employees.add("Mark");
		employees.add("Alan");
		employees.add("Luke");
		employees.add("Obi Wan");
		insuranceNumbers.add(123456);
		insuranceNumbers.add(345678);
		insuranceNumbers.add(456789);
		insuranceNumbers.add(111111);
		insuranceNumbers.add(222222);

		employees.printAll();
		insuranceNumbers.printAll();

	}
}