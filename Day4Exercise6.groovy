class Integer2 {
	int value 

	int getValue(){
		return this.value
	}

	void setValue(int setTo){
		this.value = setTo
	}

	boolean isEven(){
		if (this.value % 2 == 0){
			return true
		}

		return false
	}

	boolean isOdd(){
		if(this.isTrue() == false){
			return true
		}

		return false
	}

	void prettyPrint(){
		println this.value
	}

	String toString(){
		String returnString = this.value

		return returnString
	}

}


Integer2 i2 = new Integer2();
print "Enter a number: ";
String str = System.console().readLine();
int i = Integer.parseInt(str);
i2.setValue(i);
print "The number you entered is "
if (i2.isEven()) {
println "even.";
} else if (i2.isOdd()) {
println "odd.";
} else {
println "undefined!! Your code is buggy!";
}
int parsedInt = Integer.parseInt(i2.toString());
if (parsedInt == i2.getValue()) {
println("Your toString() method seems to work fine.");
}

