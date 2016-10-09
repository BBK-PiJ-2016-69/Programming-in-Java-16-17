// Define Variables
String input, letters = []
int length, i = 0

// Gather user input
println "Please enter your word: "
input = System.console().readLine()

// Get component parts
length = input.length()

while (i < length){
	println input.substring(i,i+1)
	i++;
}