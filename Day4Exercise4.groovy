String userInput

String hex2binary(hex){


	String binary = ""

	for(i = 0; i < hex.length() ; i++){

		if (hex.charAt(i) == "0"){
			binary = binary + " 0000"
		}
		else if (hex.charAt(i) == "1"){
			binary = binary + " 0001"
		}
		else if (hex.charAt(i) == "2"){
			binary = binary + " 0010"
		}
		else if (hex.charAt(i) == "3"){
			binary = binary + " 0011"
		}
		else if (hex.charAt(i) == "4"){
			binary = binary + " 0100"
		}
		else if (hex.charAt(i) == "5"){
			binary = binary + " 0101"
		}
		else if (hex.charAt(i) == "6"){
			binary = binary + " 0110"
		}
		else if (hex.charAt(i) == "7"){
			binary = binary + " 0111"
		}
		else if (hex.charAt(i) == "8"){
			binary = binary + " 1000"
		}
		else if (hex.charAt(i) == "9"){
			binary = binary + " 1001"
		}
		else if (hex.charAt(i) == "A"){
			binary = binary + " 1010"
		}
		else if (hex.charAt(i) == "B"){
			binary = binary + " 1011"
		}
		else if (hex.charAt(i) == "C"){
			binary = binary + " 1100"
		}
		else if (hex.charAt(i) == "D"){
			binary = binary + " 1101"
		}
		else if (hex.charAt(i) == "E"){
			binary = binary + " 1110"
		}
		else if (hex.charAt(i) == "F"){
			binary = binary + " 1111"
		}
		else {
			println "Error"
		}
	}

	return binary
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
		println hex2binary(userInput.substring(2,userInput.length()).toUpperCase())
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
