String userInput, cleanInput = ""
int i 

println "Please enter your palindrome: "
userInput = System.console().readLine()


for (i = 0; i < userInput.length() ; i++){

	if(Character.isLetter(userInput.charAt(i))==true){
		cleanInput = cleanInput + Character.toLowerCase(userInput.charAt(i))
	}

}

println cleanInput