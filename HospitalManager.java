public class HospitalManager{

	private Patient firstPatient = null;
	private int patientCount = 0;

	public static void main(String[] args){

		int i;

		HospitalManager kentAndSussex = new HospitalManager();

		Patient patientOne = new Patient ("Matt",26,"Concussion");
		kentAndSussex.addPatient(patientOne);

		Patient patientTwo = new Patient ("Tom",25,"Pathological Gluttony");
		kentAndSussex.addPatient(patientTwo);

		Patient patientThree = new Patient ("Charlotte",25,"Malignant Hypochondria");
		kentAndSussex.addPatient(patientThree);

		Patient patientFour = new Patient ("Steve",26,"Veisalgia");
		kentAndSussex.addPatient(patientFour);

		Patient patientFive = new Patient ("Mals",25,"Traumatic Earnestness");
		kentAndSussex.addPatient(patientFive);

		Patient patientSix = new Patient ("Gary",32,"Repetitve Work Depression");
		kentAndSussex.addPatient(patientSix);

		Patient patientSeven = new Patient ("Donald",70,"Mania");
		kentAndSussex.addPatient(patientSeven);

		Patient patientEight = new Patient ("Cormac",27,"Hyper Intensive Drinking Disorder");
		kentAndSussex.addPatient(patientEight);

		Patient patientNine = new Patient ("Will",26,"Forgetfulness");
		kentAndSussex.addPatient(patientNine);

		Patient patientTen = new Patient ("Will",26,"Forgetfulness");
		kentAndSussex.addPatient(patientTen);

		Patient current = kentAndSussex.getFirstPatient();

		do {	
			if(current == kentAndSussex.getFirstPatient()){
				System.out.println("\n\nName: " + current.getName() + "\nAge: " + current.getAge() + "\nIllness: " + current.getIllness());
			}
			current = current.getNextPatient();
			System.out.println("\n\nName: " + current.getName() + "\nAge: " + current.getAge() + "\nIllness: " + current.getIllness());
		}
		while(current.getNextPatient() != null);
	}


	public void addPatient(Patient newPatient) {

		if (firstPatient == null) {
			firstPatient = newPatient;		
			return;
 		}

 		Patient current = firstPatient;
 		while (current.getNextPatient() != null) {
			current = current.getNextPatient();
		}

		current.setNextPatient(newPatient);
	}

	public Patient getFirstPatient(){

		return firstPatient;
	}

 	public boolean deletePatient(String name) {


		if (firstPatient == null) {
			return false;
		}	
		if (firstPatient.getName().equals(name)) {
			firstPatient = firstPatient.getNextPatient();
			return true;
		}

		Patient current = firstPatient;
		while (current.getNextPatient() != null) {
			if (current.getNextPatient().getName().equals(name)) {
				current.setNextPatient(current.getNextPatient().getNextPatient());
				return true;
			}	
			current = current.getNextPatient();
 		}
 		return false;
 	}

}