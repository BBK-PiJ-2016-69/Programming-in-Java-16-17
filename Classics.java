public class Classics{
	
	public static void main(String[] args){

		System.out.println("Factorial of 5:" + Factorial(5));
		System.out.println("Factorial of 10:" + Factorial(10));

	}

	public static int Factorial(int number){
		if(number == 1){
			return 1;
		}
		else
		{
			return number * Factorial(number - 1);
		}
		
	}
}