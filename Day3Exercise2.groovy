double inputOne,inputTwo, result
String userInput
int failFlag

// Get first number and convert to double
println "Please input the first number:"
userInput = System.console().readLine()
inputOne = Double.parseDouble(userInput)

// Get second number and convert to double
println "Please input the second number:"
userInput = System.console().readLine()
inputTwo = Double.parseDouble(userInput)

// Get arithmatic
println "Please enter operation (+,-,/,*)"
userInput = System.console().readLine()

switch (userInput){

	case "+":
	result = inputOne + inputTwo
	break;

	case "-":
	result = inputOne - inputTwo
	break;

	case "/":
	result = inputOne / inputTwo
	break;

	case "*":
	result = inputOne * inputTwo
	break;

	default:
	println "Error."
	failFlag = 1
	break;

}

if (failFlag != 1){
println "The result of your calculation is: " + result
}
else
{
	println "---------------------------"
}


