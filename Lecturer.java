public class Lecturer extends Teacher {

	public Lecturer(String name){
		super(name);
	}
	public void doResearch(String topic) {
		System.out.println("Doing research on: " + topic);
	}
}