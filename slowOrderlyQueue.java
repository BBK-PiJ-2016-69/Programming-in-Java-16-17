public class slowOrderlyQueue implements PersonQueue {

	private Person firstPerson = null;
	private Person lastPerson = null;

	public void insert(Person newPerson){

		if(firstPerson == null){
			firstPerson = newPerson;
		}
		else
		{
			Person currentPerson = firstPerson;
			while(currentPerson.getNextPerson() != null){
				currentPerson = currentPerson.getNextPerson();
			}
			currentPerson.setNextPerson(newPerson);
			newPerson.setPreviousPerson(currentPerson);

		}
		lastPerson = newPerson;

	}

	public Person retrieve(){
		Person currentPerson = lastPerson;
			while(currentPerson.getPreviousPerson() != null){
				currentPerson = currentPerson.getPreviousPerson();
			}

		if(currentPerson.getNextPerson() != null){
			currentPerson.getNextPerson().setPreviousPerson(null);
		}
		
		return currentPerson;

	}
}