public class Classics{


	public static void main(String[] args){

		System.out.println("Factorial of 5:" + Factorial(5));
		System.out.println("Factorial of 10:" + Factorial(10));
		System.out.println("Fibonacci of 5:" + fib(5));
		System.out.println("Fibonacci of 10:" + fib(10));

		System.out.println(hanoi(3));
		System.out.println(hanoi(4));
		System.out.println(hanoi(10));
		System.out.println(hanoi(20));
		System.out.println(hanoi(30));
		System.out.println(hanoi(64));


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

	public static int fib(int n) {
		if ((n == 1) || (n == 2)) {
			return 1;
		} else {
			int result = fib(n-1) + fib(n-2); // method calls itself
			return result;
		}
	}

	public static int hanoi(int number) {
  
    if (number == 1){
      	return 1;
    } else {
      	return 1 + (2*hanoi(number - 1));
    }
  }
}