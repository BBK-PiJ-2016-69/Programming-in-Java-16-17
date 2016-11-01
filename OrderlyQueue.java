public class OrderlyQueue implements PersonQueue {

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
		}
		lastPerson = newPerson;

	}

	public Person retrieve(){
		Person returnPerson = firstPerson;
		firstPerson = firstPerson.getNextPerson();
		
		return returnPerson;

	}
}