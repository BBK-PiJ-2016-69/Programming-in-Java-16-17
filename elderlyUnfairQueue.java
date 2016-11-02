public class elderlyUnfairQueue implements PersonQueue {

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
		Person currentPerson = firstPerson;
		Person eldestPerson = firstPerson;

			while(currentPerson.getNextPerson() != null){
				if(currentPerson.getAge()>eldestPerson.getAge()){
					eldestPerson = currentPerson;
				}
				currentPerson = currentPerson.getNextPerson();	
			}

			if(currentPerson.getAge()>eldestPerson.getAge()){
					eldestPerson = currentPerson;
				}

			this.delete(eldestPerson);
		
		return eldestPerson;

	}

	public void delete(Person deletePerson){

		Person currentPerson = firstPerson;

		if(deletePerson.getName() == lastPerson.getName()){
			lastPerson.getPreviousPerson().setNextPerson(null);
		}
		else
		{
			while(currentPerson.getNextPerson() != null){
				if(currentPerson.getName() == deletePerson.getName()){
					if(currentPerson == firstPerson){
						firstPerson = currentPerson.getNextPerson();
						currentPerson.getNextPerson().setPreviousPerson(null);
					}
					else
					{
						currentPerson.getPreviousPerson().setNextPerson(currentPerson.getNextPerson());
						currentPerson.getNextPerson().setPreviousPerson(currentPerson.getPreviousPerson());
					}
				}
				currentPerson = currentPerson.getNextPerson();
			}
		}

	}

}