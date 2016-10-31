public class Marker{
	String userInput;
	int students = 0;
	int distinction = 0;
	int pass = 0;
	int fail = 0;
	int invalid = 0;
	int currentMark;

	public static void main(String[] args){
		Marker firstExam = new Marker();
		firstExam.enterMarks();

	}
	
	private void enterMarks(){

		do{
			System.out.println("Please enter a mark: ");
			userInput = System.console().readLine();
			currentMark = Integer.parseInt(userInput);

			if(currentMark == -1){
				break;
			}
			else if (currentMark > 100){
				invalid++;
			}
			else if (currentMark > 70){
				students++;
				distinction++;
			}
			else if (currentMark > 50){
				students++;
				pass++;
			}
			else if (currentMark > 0){
				students++;
				fail++;
			}
			else {
				invalid++;
			}
		}
		while (currentMark != -1);

		System.out.println("There were " + students + " students with " + distinction + " distinctions, " + pass + " passes, " + fail + " fails and " + invalid + " invalid entries.");
	}
}