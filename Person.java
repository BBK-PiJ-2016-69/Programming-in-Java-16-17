public class Person{

	private String name;
	private int age;
	private Person nextPerson;

	public Person(String name, int age, String illness) {
	this.name = name;
	this.age = age;
	this.nextPerson = null; 
	}

	public void setNextPerson(Person newNextPerson){
		this.nextPerson = newNextPerson;
	}


	public Person getNextPerson(){
		return this.nextPerson;
	}

	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}

}