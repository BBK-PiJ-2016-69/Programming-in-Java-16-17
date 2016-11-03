public class MobilePhone extends OldPhone{

	private String[] lastNumbers = new String[10];

	public MobilePhone(){
		int i;
		for(i=0; i<10; i++){
			lastNumbers[i] = "0";
		}
	}

	public void ringAlarm(String alarm){

	}

	public void playGame(String game){

	}

	public void printLastNumbers(){
		int i;
		for(i=0; i<10; i++){
			if(!lastNumbers[i].equals("0")){
				System.out.println(lastNumbers[i]);
			}
		}
	}

	@Override
	public void call(String number){
		super.call(number);
		int i;

		for(i=9; i>0; i--){
			lastNumbers[i] = lastNumbers[i-1];
		}

		lastNumbers[0] = number;

	}
}