public class Marker{
	String userInput;
	int students = 0;
	int distinction = 0;
	int pass = 0;
	int fail = 0;

	
	private void enterMarks(){

		do{
			System.out.println("Please enter a mark: ");
			userInput = System.console().readLine();
		}
		while (userInput != "-1");

	}
}