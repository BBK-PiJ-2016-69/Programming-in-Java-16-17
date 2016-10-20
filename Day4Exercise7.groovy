double totalPaid(double totalBorrowed, double rate, double years){
	
	double totalPaid = totalBorrowed * (1 + (rate/100))

	return totalPaid 
}

double yearlyPaid(double toPay, double years){

	return toPay / years
}

double timeUntilInterestPaid(double totalBorrowed, double totalPaid, double yearlyPaid){

	timeUntilInterestPaid = (totalPaid-totalBorrowed)/yearlyPaid

	return timeUntilInterestPaid
}



String userInput
double totalBorrowed, years, rate

println "Please enter the total amount to be borrowed: "
print ">>"
userInput = System.console().readLine()
totalBorrowed = Double.parseDouble(userInput)

println "Please enter the years over which the mortgage will be repaid: "
print ">>"
userInput = System.console().readLine()
years = Double.parseDouble(userInput)

println "Please enter the rate (assume simple, non compounding interest): "
print ">>"
userInput = System.console().readLine()
rate = Double.parseDouble(userInput)


// Total amount to be paid test
totalPaid = totalPaid(totalBorrowed, rate, years)
println "Total Paid: " + Math.round(totalPaid)

// Money to be paid every year test
yearlyPaid = yearlyPaid(totalPaid, years)
println "Paid each year: " + Math.round(yearlyPaid)

// Time before interest is repaid
timeUntilInterestPaid = timeUntilInterestPaid(totalBorrowed, totalPaid, yearlyPaid)
println "Time until interest paid: " + Math.round(timeUntilInterestPaid)





