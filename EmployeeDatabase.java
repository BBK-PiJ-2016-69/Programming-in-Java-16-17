public class EmployeeDatabase {

	String[] employeeNames;
	String[] tempNames = new String[2];
	int[] employeeNumbers;
	int[] tempNumbers = new int[2];
	int employeeCount = 0;

	
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
		this.employeeCount++;


		if(this.employeeCount > this.tempNames.length){
			 this.tempNames = this.expand(tempNames);
			this.tempNumbers = this.expand(tempNumbers);

		}

	}

	public String[] expand(String[] tempNames){
		String[] newNames = new String[tempNames.length*2];
		return newNames;
	}

	public int[] expand(int[] tempNumbers){
		int[] newNumbers = new int[tempNumbers.length*2];
		return newNumbers;
	}






}