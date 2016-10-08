// Declare variables
int i, j = 2, givenNumber, lowerPrime, higherPrime
String input
boolean prime

// Read input from user
println "Please enter your integer"
input = System.console().readLine()
givenNumber = Integer.parseInt(input)


while (i <= givenNumber){
 prime = true

	while (j < i){

 		if (i % j == 0){
 		prime = false
 		}

 		j++


 	}

 	if(prime == true){ lowerPrime = i}

 	j=2
 	i++;

}


i = givenNumber

while (i <= givenNumber + (givenNumber - lowerPrime)){
 prime = true

	while (j < i){

 		if (i % j == 0){
 		prime = false
 		}

 		j++


 	}

 	if(prime == true){ higherPrime = i}

 	j=2
 	i++;

}


if(higherPrime == 0){
	println "Lower Prime Closest:" + lowerPrime
}
else if (higherPrime - givenNumber < givenNumber - lowerPrime){
	println "Higher Prime Closest: " + higherPrime	
}
else if (higherPrime - givenNumber == givenNumber - lowerPrime){
	println "Both Primes equally close, higher is: " + higherPrime	
	println "Lower is:" + lowerPrime
}
