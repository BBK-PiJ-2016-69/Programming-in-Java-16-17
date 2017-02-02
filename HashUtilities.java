public class HashUtilities{
	

	public static void main(String[] args){
		String str = "This is a test string";
		String str2 = "AAAAAAAAAAaaaa994803928409284029384&^*^*(&";

		//System.out.println("Hash Code: "+str.hashCode() + " and short hash: "+HashUtilities.shortHash(str.hashCode()));
		//System.out.println("Hash Code: "+str2.hashCode() + " and short hash: "+HashUtilities.shortHash(str2.hashCode()));
	}
		

	static int shortHash(int toHash){
		toHash = Math.abs(toHash);
		return ((toHash)%1000)+1;
	}


}