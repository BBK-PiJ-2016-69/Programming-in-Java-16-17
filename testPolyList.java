public class testPolyList{
	
	public static void main(String[] args){
		polyList<String> employees = new polyList<String>();
		polyList<Integer> insuranceNumbers = new polyList<Integer>();

		employees.add("Matthew");
		employees.add("Mark");
		employees.add("Luke");
		employees.add("Obi Wan");
		insuranceNumbers.add(123456);
		insuranceNumbers.add(234567);
		insuranceNumbers.add(345678);
		insuranceNumbers.add(456789);

		employees.printAll();
		insuranceNumbers.printAll();

	}
}