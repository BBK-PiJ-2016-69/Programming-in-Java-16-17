public class MobilePhone extends OldPhone{

	private String[] lastNumbers = new String[10];

	public MobilePhone{

		for(i=0; i<10; i++){
			lastNumbers[i] = "0";
		}
	}

	public void ringAlarm(String alarm){

	}

	public void playGame(String game){

	}

	public void printLastNumbers(){

		for(i=0; i<10; i++){
			if(lastNumbers[i].notequals("0"))
				System.out.println(lastNumbers[i]);
		}
	}

	@Override
	public void call(number){
		super(number);
		int i;

		for(i=0; i<9; i++){
			lastNumbers[i+1] = lastNumbers[i];
		}

		lastNumbers[0] = number;

	}
}