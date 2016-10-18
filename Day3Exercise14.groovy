String userInput, secondHalf = ""


println "Please enter your text to make into a palindrome: "
userInput = System.console().readLine()


for(i=0 ; i < userInput.length() ; i++){

	 secondHalf = secondHalf + userInput.charAt(userInput.length()-i-1)
}

println userInput + secondHalf



