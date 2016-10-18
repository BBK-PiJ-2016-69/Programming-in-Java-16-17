String userInput,searchLetter, usedLetters = ""
int letterCount = 0
boolean match = false


// Get user input
println "Please enter your text: "
userInput = System.console().readLine()


while (match == false){
println "Please enter the letter for which to search: "
searchLetter = System.console().readLine()

	for (i = 0; i < userInput.length(); i++) {

  	 if(userInput.charAt(i) == searchLetter){
   		letterCount++ 
   		}
	}

	if(usedLetters.indexOf(searchLetter) == -1){
		usedLetters = usedLetters + searchLetter
		println letterCount
		letterCount = 0
	}
	else
	{
		match = true
		println "Repeated character. Exiting program"
	}

}