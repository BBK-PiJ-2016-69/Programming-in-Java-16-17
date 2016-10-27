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

		databaseOne.finalise();

		for(i=0; i<databaseOne.employeeCount; i++){
			if(databaseOne.employeeNumbers[i] % 2 == 0 || databaseOne.employeeNames[i].substring(0,1).equals("S")){
				System.out.println("Name: " + databaseOne.employeeNames[i] + "\tID Number: " + databaseOne.employeeNumbers[i]);
			}
		}
		

	}

	public void addEmployee(String name, int number){


		if(this.employeeCount == this.tempNames.length){
			this.tempNames = this.expand(tempNames);
			this.tempNumbers = this.expand(tempNumbers);

		}

		this.tempNames[employeeCount] = name;
		this.tempNumbers[employeeCount] = number;

		this.employeeCount++;


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

	public void finalise(){
		int i;
		this.employeeNames = new String[this.employeeCount];
		this.employeeNumbers = new int[this.employeeCount];

		for(i = 0; i < this.employeeCount; i++){
			employeeNames[i] = this.tempNames[i];
			employeeNumbers[i] = this.tempNumbers[i];
		}

	}






}