public class SmartPhoneUser{
	
	public static void main(String[] args){
		SmartPhone iPhone = new SmartPhone("iPhone");

		System.out.println("---");

		SmartPhoneUser matt = new SmartPhoneUser();
		matt.testPhone(iPhone);
	}

	public void testPhone(Phone phone){
		SmartPhone smartPhone = (SmartPhone)phone;
		System.out.println(smartPhone.browseWeb("http://www.google.co.uk"));
		smartPhone.call("999");
		System.out.println(smartPhone.findPosition());
		smartPhone.printLastNumbers();

	}
}