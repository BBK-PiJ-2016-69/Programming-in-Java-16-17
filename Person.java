public class Person{

	private String name;
	private int age;
	private Person nextPerson;
	private Person previousPerson;

	public Person(String name, int age) {
	this.name = name;
	this.age = age;
	this.nextPerson = null; 
	}

	public void setNextPerson(Person newNextPerson){
		this.nextPerson = newNextPerson;
	}

	public void setPreviousPerson(Person newPreviousPerson){
		this.previousPerson = newPreviousPerson;
	}


	public Person getNextPerson(){
		return this.nextPerson;
	}

	public Person getPreviousPerson(){
		return this.previousPerson;
	}

	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}

}