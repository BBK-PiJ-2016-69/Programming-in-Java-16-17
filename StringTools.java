public class StringTools extends String{
	
	public String printEven(String str){
		int i;
		String returnStr;
		for(i=0;i<str.length();i++){
			if(i % 2 == 0){
				returnStr += returnStr.CharAt(i);
			}
		}
	}
}