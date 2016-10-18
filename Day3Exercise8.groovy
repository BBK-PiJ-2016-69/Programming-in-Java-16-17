String userInput
int i


// Get user input
println "Please enter your text: "
userInput = System.console().readLine()

for (i = 0; i < userInput.length(); i++) {
   println userInput.charAt(i)
}