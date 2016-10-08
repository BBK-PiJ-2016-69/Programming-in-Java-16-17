// Define variables
int denominator = 1, givenNumber, i=1
double answer
boolean add = true
String input

// Get user input
println "Please enter the number of terms to calculate: "
input = System.console().readLine()
givenNumber = Integer.parseInt(input)

// Loop while within chosen number of terms
while (i < givenNumber){

	// Deal within intial case
	if(i == 1){
		answer = 4/denominator
	}

	// Deal with addition term
	else if (add == true){
		answer = answer + (4/denominator)
	}

	// Deal with subtration term
	else if (add == false){
		answer = answer - (4/denominator)
	}

	// Update denominator
	denominator = (2 * i) + 1

	// Update loop
	i++

	// Invert term
	add = ! add
}

// Display output
println "Answer: " + answer
println "For given number of terms: " + givenNumber