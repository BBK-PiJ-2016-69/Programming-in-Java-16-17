public class SmartPhone extends MobilePhone{
	
	public String browseWeb(String url){
		String pageContents = "<html><head><title>Not Connected to Internet</title></head><body><p>A connection could not be established.</p></body></html>";
		return pageContents;
	}

	public String findPosition(){
		String position = "50.5421° N, 4.9390° W";

		return position;
	}
}