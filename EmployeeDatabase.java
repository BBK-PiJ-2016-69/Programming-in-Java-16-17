public class EmployeeDatabase {

	String[] employeeNames = new String[2];
	int[] employeeNumbers = new int[2];

	
	public static void main (String[] args){

		String userInput, employeeName;
		boolean completed = false;
		int employeeNumber;

		while(completed == false){
			EmployeeDatabase databaseOne = new EmployeeDatabase();
			System.out.println("Please enter employee name: ");
			System.out.print(">>");
			userInput = System.console().readLine();

			if(userInput.equals("")){
				completed = true;
				break;
			}

			employeeName = userInput;

			System.out.println("Please enter employee number: ");
			System.out.print(">>");
			userInput = System.console().readLine();

			if(userInput.equals("0")){
				completed = true;
				break;
			}

			employeeNumber = Integer.parseInt(userInput);

			databaseOne.addEmployee(employeeName,employeeNumber);

		}

	}

	public void addEmployee(String name, int number){

	}




}