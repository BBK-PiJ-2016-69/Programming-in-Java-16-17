public class circleHospitalManager{

	private circlePatient firstPatient = null;
	private circlePatient lastPatient = null;
	private int patientCount = 0;


	public static void main(String[] args){

		int i;

		circleHospitalManager kentAndSussex = new circleHospitalManager();

		circlePatient patientOne = new circlePatient ("Matt",26,"Concussion");
		kentAndSussex.addPatient(patientOne);

		circlePatient patientTwo = new circlePatient ("Tom",25,"Pathological Gluttony");
		kentAndSussex.addPatient(patientTwo);

		circlePatient patientThree = new circlePatient ("Charlotte",25,"Malignant Hypochondria");
		kentAndSussex.addPatient(patientThree);

		circlePatient patientFour = new circlePatient ("Steve",26,"Veisalgia");
		kentAndSussex.addPatient(patientFour);

		circlePatient patientFive = new circlePatient ("Mals",25,"Traumatic Earnestness");
		kentAndSussex.addPatient(patientFive);

		circlePatient patientSix = new circlePatient ("Gary",32,"Repetitve Work Depression");
		kentAndSussex.addPatient(patientSix);

		circlePatient patientSeven = new circlePatient ("Donald",70,"Mania");
		kentAndSussex.addPatient(patientSeven);

		circlePatient patientEight = new circlePatient ("Cormac",27,"Hyper Intensive Drinking Disorder");
		kentAndSussex.addPatient(patientEight);

		circlePatient patientNine = new circlePatient ("Will",26,"Forgetfulness");
		kentAndSussex.addPatient(patientNine);

		circlePatient patientTen = new circlePatient ("Will",26,"Forgetfulness");
		kentAndSussex.addPatient(patientTen);


		// Show all elements
		kentAndSussex.printAll();
		System.out.println("-----------------");

		// Show elements backwards
		kentAndSussex.printAllBackwards();
		System.out.println("-----------------");

		// Remove two existing elements
		kentAndSussex.deletePatient("Matt");
		kentAndSussex.deletePatient("Mals");

		// Show updated list of elements
		kentAndSussex.printAll();
		System.out.println("-----------------");

		// Show list backwards
		kentAndSussex.printAllBackwards();
		System.out.println("-----------------");

		// Delete a non-existant element
		kentAndSussex.deletePatient("President Trump");

		// Add another element
		circlePatient patientEleven = new circlePatient ("Tomothy",30,"Blackberry Fingers");
		kentAndSussex.addPatient(patientEleven);

		// Show updated list of elements
		kentAndSussex.printAll();
		System.out.println("-----------------");

		// Show list backwards
		kentAndSussex.printAllBackwards();
		System.out.println("-----------------");

	
	}


	public void addPatient(circlePatient newPatient) {

		this.patientCount++;

		if (firstPatient == null) {
			firstPatient = newPatient;	
			lastPatient = firstPatient;	
			firstPatient.setNextPatient(firstPatient);
			return;
 		}

 		circlePatient current = firstPatient;
 		while (current.getNextPatient() != firstPatient) {
 			System.out.println("-->" + current.getNextPatient().getName());
			current = current.getNextPatient();
		}

		current.setNextPatient(newPatient);
		System.out.println("--> First Patient: " + firstPatient.getName());
		System.out.println("--> Current Patient: " + current.getName());
		System.out.println("--> Setting Next Patient: " + newPatient.getName());
		newPatient.setPreviousPatient(current);
		System.out.println("--> Setting Previous Patient of New Patient to: " + current.getName());
		newPatient.setNextPatient(firstPatient);
		System.out.println("--> Setting Next Patient of New Patient to: " + firstPatient.getName());
		lastPatient = newPatient;
		System.out.println("--> Setting Last Patient to: " + lastPatient.getName());
		firstPatient.setPreviousPatient(lastPatient);
		
	}

	public circlePatient getFirstPatient(){
		return firstPatient;
	}

	public circlePatient getLastPatient(){
		return lastPatient;
	}

 	public boolean deletePatient(String name) {
 		

		if (firstPatient == null || lastPatient == null) {
			return false;
		}	
		if (firstPatient.getName().equals(name)) {
			firstPatient = firstPatient.getNextPatient();
			firstPatient.setPreviousPatient(lastPatient);
			lastPatient.setNextPatient(firstPatient);
			this.patientCount--;
			return true;
		}

		if (lastPatient.getName().equals(name)) {
			this.patientCount--;
			lastPatient = lastPatient.getPreviousPatient();
			lastPatient.setNextPatient(firstPatient);
			return true;
		}


		circlePatient current = firstPatient;
		while (current.getNextPatient() != this.getLastPatient()) {
			if (current.getNextPatient().getName().equals(name)) {
				this.patientCount--;
				current.setNextPatient(current.getNextPatient().getNextPatient());
				current.getNextPatient().setPreviousPatient(current);
				return true;
			}	
			current = current.getNextPatient();
 		}
 		return false;
 	}

 	public void printAll(){
 		int i = 0;
 		circlePatient current = this.getFirstPatient();

		do {	
			if(current == this.getFirstPatient()){
				System.out.println("\n\nName: " + current.getName() + "\nAge: " + current.getAge() + "\nIllness: " + current.getIllness());
			}
			current = current.getNextPatient();
			System.out.println("\n\nName: " + current.getName() + "\nAge: " + current.getAge() + "\nIllness: " + current.getIllness());
			i++;
		}
		while(i < this.patientCount-1);
 	}

 	public void printAllBackwards(){
 		int i = 0;
 		circlePatient current = this.getLastPatient();

		do {	
			if(current == this.getLastPatient()){
				System.out.println("\n\nName: " + current.getName() + "\nAge: " + current.getAge() + "\nIllness: " + current.getIllness());
			}
			current = current.getPreviousPatient();
			System.out.println("\n\nName: " + current.getName() + "\nAge: " + current.getAge() + "\nIllness: " + current.getIllness());
			i++;
		}
		while(i < this.patientCount-1);
 	}

 	public int countPatients(){
 		return this.patientCount;
 	}

}