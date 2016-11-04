public class StackOverflow{
	
	public static void main(String[] args){
		StackOverflow so = new StackOverflow();

		//so.intOverflow(1);
		so.stringOverflow("Hello",0);
	}

	public int intOverflow(int intOne){
		System.out.println(">"+intOne);
		return intOverflow(intOne+1);
	}

	public String stringOverflow(String str, int i){
		i++;
		System.out.println(">"+i);
		return stringOverflow(str, i);
	}
}