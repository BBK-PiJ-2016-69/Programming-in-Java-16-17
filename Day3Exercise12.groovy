float purchasePrice, cashGiven, change
def currencyAvailable = [50,20,10,5,2,1,0.5,0.2,0.1,0.05,0.02,0.01]
def displayCurrency = ["£50s","£20s","£10s","£5s","£2s","£1s","50ps","20ps","10ps","5ps","2ps","1ps"]
String userInput
int i = 0 

// Get user input
println "Please enter the price of the purchase:"
userInput = System.console().readLine()
purchasePrice = Double.parseDouble(userInput)

println "Please enter the cash given:"
userInput = System.console().readLine()
cashGiven = Double.parseDouble(userInput)


change = cashGiven - purchasePrice


while (i < currencyAvailable.size()){

	if(change > currencyAvailable[i]){

		println displayCurrency[i] + ": " + (change/currencyAvailable[i]).trunc()
		change = change % currencyAvailable[i]

	}

	i++

}

