public class Comparator {

	public static void main(String[] args){
		int intOne = 12, intTwo = 15;
		double doubleOne = 2, doubleTwo = 5;
		String stringOne = "21", stringTwo = "25";

		Comparator comp = new Comparator();

		System.out.println(comp.getMax(intOne,intTwo));
		System.out.println(comp.getMax(doubleOne,doubleTwo));
		System.out.println(comp.getMax(stringOne,stringTwo));

	}

	public int getMax(int int1, int int2) {
		return (int)getMax((double)int1, (double)int2);
	}

	public String getMax(String str1, String str2) {
		Double double1 = Double.parseDouble(str1);
		Double double2 = Double.parseDouble(str2);

		return String.valueOf(getMax(double1, double2));
	}

	public double getMax(double d1, double d2) {

		if (d1 > d2) {
			return d1;
		} else {
			return d2;
		}
	}

	

}