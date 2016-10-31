public class doubleHospitalManager{

	private doublePatient firstPatient = null;
	private doublePatient lastPatient = null;
	private int patientCount = 0;

	public static void main(String[] args){

		int i;

		doubleHospitalManager kentAndSussex = new doubleHospitalManager();

		doublePatient patientOne = new doublePatient ("Matt",26,"Concussion");
		kentAndSussex.addPatient(patientOne);

		doublePatient patientTwo = new doublePatient ("Tom",25,"Pathological Gluttony");
		kentAndSussex.addPatient(patientTwo);

		doublePatient patientThree = new doublePatient ("Charlotte",25,"Malignant Hypochondria");
		kentAndSussex.addPatient(patientThree);

		doublePatient patientFour = new doublePatient ("Steve",26,"Veisalgia");
		kentAndSussex.addPatient(patientFour);

		doublePatient patientFive = new doublePatient ("Mals",25,"Traumatic Earnestness");
		kentAndSussex.addPatient(patientFive);

		doublePatient patientSix = new doublePatient ("Gary",32,"Repetitve Work Depression");
		kentAndSussex.addPatient(patientSix);

		doublePatient patientSeven = new doublePatient ("Donald",70,"Mania");
		kentAndSussex.addPatient(patientSeven);

		doublePatient patientEight = new doublePatient ("Cormac",27,"Hyper Intensive Drinking Disorder");
		kentAndSussex.addPatient(patientEight);

		doublePatient patientNine = new doublePatient ("Will",26,"Forgetfulness");
		kentAndSussex.addPatient(patientNine);

		doublePatient patientTen = new doublePatient ("Will",26,"Forgetfulness");
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

		// Show updated list of elements
		kentAndSussex.printAll();
		System.out.println("-----------------");

		// Show list backwards
		kentAndSussex.printAllBackwards();
		System.out.println("-----------------");

	
	}


	public void addPatient(doublePatient newPatient) {

		if (firstPatient == null) {
			firstPatient = newPatient;	
			lastPatient = firstPatient;	
			return;
 		}

 		doublePatient current = firstPatient;
 		while (current.getNextPatient() != null) {
			current = current.getNextPatient();
		}

		current.setNextPatient(newPatient);
		newPatient.setPreviousPatient(current);
		lastPatient = newPatient;
	}

	public doublePatient getFirstPatient(){
		return firstPatient;
	}

	public doublePatient getLastPatient(){
		return lastPatient;
	}

 	public boolean deletePatient(String name) {


		if (firstPatient == null || lastPatient == null) {
			return false;
		}	
		if (firstPatient.getName().equals(name)) {
			firstPatient = firstPatient.getNextPatient();
			firstPatient.setPreviousPatient(null);
			return true;
		}

		if (lastPatient.getName().equals(name)) {
			lastPatient = lastPatient.getPreviousPatient();
			return true;
		}


		doublePatient current = firstPatient;
		while (current.getNextPatient() != null) {
			if (current.getNextPatient().getName().equals(name)) {
				current.setNextPatient(current.getNextPatient().getNextPatient());
				current.getNextPatient().setPreviousPatient(current);
				return true;
			}	
			current = current.getNextPatient();
 		}
 		return false;
 	}

 	public void printAll(){
 		doublePatient current = this.getFirstPatient();

		do {	
			if(current == this.getFirstPatient()){
				System.out.println("\n\nName: " + current.getName() + "\nAge: " + current.getAge() + "\nIllness: " + current.getIllness());
			}
			current = current.getNextPatient();
			System.out.println("\n\nName: " + current.getName() + "\nAge: " + current.getAge() + "\nIllness: " + current.getIllness());
		}
		while(current.getNextPatient() != null);
 	}

 	public void printAllBackwards(){
 		doublePatient current = this.getLastPatient();

		do {	
			if(current == this.getLastPatient()){
				System.out.println("\n\nName: " + current.getName() + "\nAge: " + current.getAge() + "\nIllness: " + current.getIllness());
			}
			current = current.getPreviousPatient();
			System.out.println("\n\nName: " + current.getName() + "\nAge: " + current.getAge() + "\nIllness: " + current.getIllness());
		}
		while(current.getPreviousPatient() != null);
 	}

 	public int countPatients(){
 		int patientCount = 1;
 		doublePatient current = this.getFirstPatient();

 		do {	
			current = current.getNextPatient();
			patientCount++;
		}
		while(current.getNextPatient() != null);

 		return patientCount;
 	}

}