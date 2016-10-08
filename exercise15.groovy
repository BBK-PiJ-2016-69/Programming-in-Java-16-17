// Define variables
String input
int guess, randomNumber, numberOfGuesses
boolean correct = false

// Generate random number
randomNumber = Math.abs(1000 * Math.random())

// Initial output
println "Try to guess my number!"


while (correct != true){

	// Increase number of guesses
	numberOfGuesses++

	// Gather input and convert to integer
	println "Tell me a number: "
	input = System.console().readLine()
	guess = Integer.parseInt(input)

	// Check if guess is true
	if (guess == randomNumber){
		println "Correct!"
		println "You needed " + numberOfGuesses + " guesses"
		correct == true
		break
	}

	else if (guess > randomNumber){
		println "No! My number is lower"
	}

	else if (guess < randomNumber){
		println "No! My number is higher"
	}


}

