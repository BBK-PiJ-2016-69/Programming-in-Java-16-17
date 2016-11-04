public class Palindrome{


	public static void main(String[] args){
		Palindrome palindrome = new Palindrome();

		System.out.println(palindrome.pal("This is a test"));
		System.out.println(palindrome.pal("racecar"));
		System.out.println(palindrome.pal("was raw tap ale not a reviver at one lap at warsaw"));
	}


	public boolean pal(String str){
		if(str.length() <= 1){
			return true;
		}

		if(str.charAt(0) == str.charAt(str.length()-1)){
			pal(str.substring(1,str.length()-1));
			return true;
		}
		else
		{
			return false;
		}
	
	}

}