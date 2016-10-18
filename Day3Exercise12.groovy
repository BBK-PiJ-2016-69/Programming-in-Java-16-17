double purchasePrice, cashGiven, change, displayCurrency
def currencyAvailable = [50,20,10,5,2,1,0.5,0.2,0.1,0.05,0.02,0.01]
def displayCurrency = ["£50s","£20s","£10s"]
String userInput
int i 

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
		if(currencyAvailable[i]>=1){
			println "£" + currencyAvailable[i] +"s: " + (change/currencyAvailable[i]).trunc()
		}
		else
		{
			displayCurrency = (currencyAvailable[i]*100)
			println "" + displayCurrency.trunc() + "ps: " + (change/currencyAvailable[i]).trunc()
		}
		change = change % currencyAvailable[i]
	}

	i++

}

