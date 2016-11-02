public class clusteredUnfairQueue implements PersonQueue {

	private Person firstPerson = null;
	private Person lastPerson = null;
	private int size = 0;

	public void insert(Person newPerson){

		size++;

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
		Person returnedPerson = null;
		boolean chosen = false;

		if(firstPerson.getNextPerson() == null){
			return firstPerson;
		}
		
		// Remove over 65
		while(currentPerson.getNextPerson() != null && returnedPerson == null){
			if(currentPerson.getAge()>65){
				returnedPerson = currentPerson;
			}
			currentPerson = currentPerson.getNextPerson();
		}

		// Remove over 18s
		currentPerson = firstPerson;
		while(currentPerson.getNextPerson() != null && returnedPerson == null){
			if(currentPerson.getAge()>18){
				returnedPerson = currentPerson;
			}
			currentPerson = currentPerson.getNextPerson();
		}

		// Remove others
		currentPerson = firstPerson;
		while(currentPerson.getNextPerson() != null && returnedPerson == null){
			returnedPerson = currentPerson;
			currentPerson = currentPerson.getNextPerson();
		}


		this.delete(returnedPerson);
		
		return returnedPerson;

	}

	public void delete(Person deletePerson){

		Person currentPerson = firstPerson;
		boolean done = false;
		int i;
		
		for(i=0; i < size; i++){
			if(currentPerson == deletePerson){
				if(currentPerson == firstPerson){
					currentPerson.getNextPerson().setPreviousPerson(null);
					firstPerson=currentPerson.getNextPerson();
					done = true;
				}
				else if(currentPerson == lastPerson && done!=true){
					currentPerson.getPreviousPerson().setNextPerson(null);
					lastPerson = currentPerson.getPreviousPerson();
					done = true;
				}
				else if(done!= true)
				{

					currentPerson.getPreviousPerson().setNextPerson(currentPerson.getNextPerson());
					currentPerson.getNextPerson().setPreviousPerson(currentPerson.getPreviousPerson());
					done = true;
				}
			}
			if(done == false){
				currentPerson = currentPerson.getNextPerson();
			}
		}
		
			
		size--;
	}

}