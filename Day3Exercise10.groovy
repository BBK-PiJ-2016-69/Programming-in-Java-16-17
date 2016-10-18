String userInput,searchString
int offset = 0, matchCount = 0
boolean match = false


// Get user input
println "Please enter your text: "
userInput = System.console().readLine()

println "Please enter the string for which to search: "
searchString = System.console().readLine()

while(offset < userInput.length()-searchString.length())
{
	if (match == true){
		matchCount++
	}

	match = false

	for (i = 0; i < searchString.length(); i++) {
		if(userInput.charAt(i+offset) == searchString.charAt(i)){
			match = true
		}
		else
		{
			match = false
		}
	}
	offset++;
}

println "Matches: " + matchCount