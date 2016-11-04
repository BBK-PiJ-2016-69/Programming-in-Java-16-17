public class GCD{
	
	public static void main(String[] args){
		GCD gcd = new GCD();

		System.out.println(gcd.getGCD(12,15));
	}

	public int getGCD(int p, int q){
		if(q > p){
			int temp = p;
			p = q;
			q = temp;
		}

		if(p % q == 0){
			return q;
		}
		else
		{
			return getGCD(p, p%q);
		}
	}
}