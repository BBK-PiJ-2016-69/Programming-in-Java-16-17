public class MobilePhone extends OldPhone{

	private String[] lastNumbers = new String[10];

	public MobilePhone(String brand){
		super(brand);
		int i;
		for(i=0; i<10; i++){
			lastNumbers[i] = "0";
		}
	}

	public void ringAlarm(String alarm){

	}

	private String playGame(String game){

		return game;
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
		if(number.substring(0,2).equals("00")){
			System.out.println("Calling "+number+" through the internet to save money");
		}
		else
		{
			super.call(number);
		}
		int i;

		for(i=9; i>0; i--){
			lastNumbers[i] = lastNumbers[i-1];
		}

		lastNumbers[0] = number;

	}
}