double purchasePrice, cashGiven, change, remainder
String userInput

// Get user input
println "Please enter the price of the purchase:"
userInput = System.console().readLine()
purchasePrice = Double.parseDouble(userInput)

println "Please enter the cash given:"
userInput = System.console().readLine()
cashGiven = Double.parseDouble(userInput)


change = cashGiven - purchasePrice


if(change > 50){
	println "£50s: " + (change/50).trunc()
	change = change % 50
	println "Change: " + change
}



println remainder