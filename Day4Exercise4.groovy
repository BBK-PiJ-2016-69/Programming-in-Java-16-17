String userInput

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

String hex2binary(hex){
	return hex
}

String binary2hex(binaryString){

	String formattedBinary = ""
	// Remove any spaces
	for (i = 0 ; i < binaryString.length() ; i++){
		if(binaryString.charAt(i) == " "){

		}
		else
		{
			formattedBinary = formattedBinary + binaryString.charAt(i)
		}
	}

	return formattedBinary
}


println "Please enter your number: "
userInput = System.console().readLine()

if(userInput.length() > 2){

	if(userInput.substring(0,2)=="0x"){
		println hex2binary(userInput.substring(2,userInput.length()))
	}
	else
	{
		println binary2hex(userInput)
	}
}
else
{
	println binary2hex(userInput)
}
