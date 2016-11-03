public class School {
	
	public static void main(String[] args){
		Lecturer epicurus = new Lecturer("Epicurus");

		epicurus.doResearch("Ataraxia");
		epicurus.teach("Philosophy & PE");

		System.out.println(epicurus.getName());
	}
}