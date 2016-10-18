String userInput,searchString
int offset = 0


// Get user input
println "Please enter your text: "
userInput = System.console().readLine()

println "Please enter the string for which to search: "
searchString = System.console().readLine()


for (i = 0; i < searchString.length(); i++) {
	println userInput.charAt(i+offset)
}
