public class PhoneLauncher {

	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}

	public void launch() {
		SmartPhone iPhone = new SmartPhone();

		iPhone.call("999");
		iPhone.call("09011105010");

		iPhone.printLastNumbers();

		System.out.println(iPhone.findPosition());

		System.out.println(iPhone.browseWeb("http://www.google.co.uk"));
	}
}