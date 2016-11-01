public class Supermarket{
	
	public static void main(String[] args){
		Supermarket tesco = new Supermarket();
		Person personOne = new Person("Matt",26);
		Person personTwo = new Person("Tom",25);

		PersonQueue firstQueue = new OrderlyQueue();
		tesco.addPerson(firstQueue,personOne);
		tesco.addPerson(firstQueue,personTwo);

		tesco.servePerson(firstQueue);
		tesco.servePerson(firstQueue);

		//PersonQueue secondQueue = new OrderlyQueue();
		
	}

	public void addPerson(PersonQueue queue, Person newPerson){
		System.out.println("Joining queue: "+newPerson.getName());
		queue.insert(newPerson);
		
	}

	public void servePerson(PersonQueue queue){
		System.out.println("Now serving: " + queue.retrieve().getName());
	}


}