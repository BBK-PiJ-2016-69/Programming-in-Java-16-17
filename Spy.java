class Spy{
	private int id;
	public static int spyCount;

	public static void main(String[] args){

		Spy spyOne = new Spy(1);
		Spy spyTwo = new Spy(2);
		Spy spyThree = new Spy(3);
		Spy spyFour = new Spy(4);
		Spy spyFive = new Spy(5);

		spyFour.die();
		spyTwo.die();

	}

	public Spy(int id){
		this.id = id;
		spyCount++;

		System.out.println("New spy "+ id + " has been recruited. Currently there are " + spyCount + " spies in operation.");
	}

	public void die(){
		spyCount--;

		System.out.println("Spy "+this.id+ " has died. There are now " + spyCount + " spies in operation.");
	}


}