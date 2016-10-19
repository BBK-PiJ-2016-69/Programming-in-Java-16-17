String userInput
int base, exponent, result
boolean running = true


int power(b, e){
	int originalBase = b

	if(e == 0){
		return 1
	}
	for(i = 1 ; i < e ; i++) {
		 b = b * originalBase
	}

	return b
}

int power2(e){
	return power(2,e)
}


int binary2decimal(binaryString){

	int binaryDigit, result = 0, i = 0;
	Character binaryCharacter

	for (i = 0 ; i < binaryString.length() ; i++){

		binaryCharacter = binaryString.charAt(binaryString.length()-1-i)
		binaryDigit = Character.getNumericValue(binaryCharacter)

		result = result + (binaryDigit * power2(i))
	}

	
	return result
}

String decimal2binary(decimalNumberString){

	int remainder, decimalNumber
	String result = "", returnResult = ""

	decimalNumber = Integer.parseInt(decimalNumberString)

	while(decimalNumber > 0){

		remainder = decimalNumber % 2
		decimalNumber = decimalNumber / 2
		result = result + remainder
	}

	for (i = 0 ; i < result.length() ; i++){
		returnResult = returnResult + result.charAt(result.length()-i-1)
	}


	return returnResult
}


void getPower(){
	println "Please enter the base: "
	userInput = System.console().readLine()
	base = Integer.parseInt(userInput)

	println "Please enter the exponent: "
	userInput = System.console().readLine()
	exponent = Integer.parseInt(userInput)

	println power(base,exponent)
}

void getPower2(){
	println "Please enter the exponent: "
	userInput = System.console().readLine()
	exponent = Integer.parseInt(userInput)

	println power2(exponent)
}

void getBinary2Decimal(){
	println "Please enter a binary number"
	userInput = System.console().readLine()

	println binary2decimal(userInput)
}

void getDecimal2Binary(){
	println "Please enter a decimal number"
	userInput = System.console().readLine()

	println decimal2binary(userInput)
}


while(running == true){
	println ""
	println "------------------------------------------"
	println "Please enter your selection:"
	println "1) Power of two numbers"
	println "2) Power of 2 to chosen exponent"
	println "3) Convert a binary number to decimal"
	println "4) Convert a decimal number to binary"
	println "0) Exit the program"
	print ">"

	userInput = System.console().readLine()

	switch(userInput){

		case "0":
			running = false
			break;

	case "1":
			getPower()
			break;

	case "2":
			getPower2()
			break;

	case "3":
			getBinary2Decimal()
			break;

	case "4":
			getDecimal2Binary()
			break;

	default:
			println "Error: Please choose one of the available options"
			break;


	}		

}

println "Thanks for using this program"





