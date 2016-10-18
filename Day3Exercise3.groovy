Double termOne, termTwo, result
String userInput, operator, termOneString, termTwoString

println "Please enter a mathematical operation (e.g. 4*6): "
userInput  = System.console().readLine()

userInput = userInput.replaceAll(" ","")

if(userInput.indexOf("+") != -1){

	termOneString = userInput.substring(0,userInput.indexOf("+"))
	termOne = Double.parseDouble(termOneString)

	termTwoString = userInput.substring(userInput.indexOf("+")+1,userInput.length())
	termTwo = Double.parseDouble(termTwoString)
	
	result = termOne + termTwo
}

if(userInput.indexOf("-") != -1){
	termOneString = userInput.substring(0,userInput.indexOf("-"))
	termOne = Double.parseDouble(termOneString)

	termTwoString = userInput.substring(userInput.indexOf("-")+1,userInput.length())
	termTwo = Double.parseDouble(termTwoString)
	
	result = termOne - termTwo
}

if(userInput.indexOf("/") != -1){
	termOneString = userInput.substring(0,userInput.indexOf("/"))
	termOne = Double.parseDouble(termOneString)

	termTwoString = userInput.substring(userInput.indexOf("/")+1,userInput.length())
	termTwo = Double.parseDouble(termTwoString)
	
	result = termOne / termTwo
}

if(userInput.indexOf("*") != -1){
	termOneString = userInput.substring(0,userInput.indexOf("*"))
	termOne = Double.parseDouble(termOneString)

	termTwoString = userInput.substring(userInput.indexOf("*")+1,userInput.length())
	termTwo = Double.parseDouble(termTwoString)
	
	result = termOne * termTwo
}

println "Result: " + result

