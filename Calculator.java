public class Calculator{


	public static void main(String[] args){
		
		Calculator calc = new Calculator();

		int numberOne = 10, numberTwo = 2;


		System.out.println("10 + 2");
		System.out.println(calc.add(numberOne, numberTwo));

		System.out.println("10 - 2");
		System.out.println(calc.subtract(numberOne, numberTwo));

		System.out.println("10 * 2");
		System.out.println(calc.multiply(numberOne, numberTwo));

		System.out.println("10 / 2");
		System.out.println(calc.divide(numberOne, numberTwo));

		System.out.println("10 % 2");
		System.out.println(calc.modulus(numberOne, numberTwo));
	}

	
	public double add(int numberOne, int numberTwo){

		double doubleOne = (double) numberOne;
		double doubleTwo = (double) numberTwo;

		return doubleOne + doubleTwo;
	}

	public double subtract(int numberOne, int numberTwo){

		double doubleOne = (double) numberOne;
		double doubleTwo = (double) numberTwo;

		return doubleOne - doubleTwo;
	}

	public double multiply(int numberOne, int numberTwo){

		double doubleOne = (double) numberOne;
		double doubleTwo = (double) numberTwo;

		return doubleOne * doubleTwo;
	}

	public double divide(int numberOne, int numberTwo){

		double doubleOne = (double) numberOne;
		double doubleTwo = (double) numberTwo;

		return doubleOne / doubleTwo;
	}

	public double modulus(int numberOne, int numberTwo){

		double doubleOne = (double) numberOne;
		double doubleTwo = (double) numberTwo;

		return doubleOne % doubleTwo;
	}

}

