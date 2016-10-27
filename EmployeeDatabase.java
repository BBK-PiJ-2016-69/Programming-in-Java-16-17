public class EmployeeDatabase {

	String[] employeeNames;
	String[] tempNames = new String[2];
	int[] employeeNumbers;
	int[] tempNumbers = new int[2];
	int employeeCount = 0;

	
	public static void main (String[] args){

		String userInput, employeeName;
		boolean completed = false;
		int employeeNumber, i;
		EmployeeDatabase databaseOne = new EmployeeDatabase();

		while(completed == false){
			
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

		for(i=0; i<databaseOne.employeeNames.length; i++){
			System.out.println(databaseOne.employeeNames[i]);
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
		int i;
		String[] newNames = new String[tempNames.length*2];


		for(i = 0; i < tempNames.length; i++){
			newNames[i] = tempNames[i];
		}
		return newNames;
	}

	public int[] expand(int[] tempNumbers){
		int i;
		int[] newNumbers = new int[tempNumbers.length*2];

		for(i = 0; i < tempNumbers.length; i++){
			newNumbers[i] = tempNumbers[i];
		}

		return newNumbers;
	}






}