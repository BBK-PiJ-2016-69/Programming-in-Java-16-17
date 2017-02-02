public class Initials {


	public static void main (String[] args){

		Initials initials = new Initials();
		String input = "Matthew Grint";
		String output = initials.getInitials(input);
		String expected = "MG";

		System.out.println(output);
		System.out.println(output.equals(expected));
	}

	public String getInitials(String fullName) {

		fullName = fullName.replaceAll("\\s+"," ");
		String result = "";
		String nextInitial;
		String[] words = fullName.split(" ");
		for (int i = 0; i < words.length; i++) {
			nextInitial = "" + words[i].charAt(0);
			result = result + nextInitial.toUpperCase();
			}		
		return result;
	}

}