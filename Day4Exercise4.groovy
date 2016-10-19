String userInput


String hex2binary(hex){
	return hex
}

String binary2hex(binaryString){

	String formattedBinary = "", result = ""
	int digitLocation = 1, binaryDigit, currentValue = 0

	

		// Remove any spaces
	for (i = 0 ; i < binaryString.length() ; i++){
		if(binaryString.charAt(i) == " "){

		}
		else
		{
			formattedBinary = formattedBinary + binaryString.charAt(i)
		}
	}

	// Ensure it is in four even groups
	int remainder = formattedBinary.length() % 4

	while(remainder != 0){
		formattedBinary = "0" + formattedBinary
		remainder--
	}

	

	for (i = 0 ; i < formattedBinary.length() ; i++){

		binaryDigit = Character.getNumericValue(formattedBinary.charAt(i))


		switch(digitLocation){
			case 1:
					currentValue = currentValue + (binaryDigit * 8)
			break;

			case 2:
					currentValue = currentValue + (binaryDigit * 4)
			break;

			case 3:
					currentValue = currentValue + (binaryDigit * 2)
			break;

			case 4:
					currentValue = currentValue + (binaryDigit * 1)

					if(currentValue < 10){
						result = result + currentValue
					}
					else if (currentValue == 10){
						result = result + "A"
					}
					else if (currentValue == 11){
						result = result + "B"
					}
					else if (currentValue == 12){
						result = result + "C"
					}
					else if (currentValue == 13){
						result = result + "D"
					}
					else if (currentValue == 14){
						result = result + "E"
					}
					else if (currentValue == 15){
						result = result + "F"
					}
					else
					{
						println "ERROR"
					}
					currentValue = 0
					digitLocation = 0
			break;

		}
		
		digitLocation++

	}


	return result
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
