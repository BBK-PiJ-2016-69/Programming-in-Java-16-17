public class Maths{
	
	public static void main(String[] args){
		Maths maths = new Maths();

		System.out.println(maths.pow(2,10));
	}
	public int pow(int base, int exponent){
		int result;

		if(exponent == 1){
			return base;
		}
		
		return base * pow(base,exponent-1);
	}
}