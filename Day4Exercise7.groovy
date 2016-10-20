double totalPaid(double totalBorrowed, double rate, double years){
	
	double totalPaid = totalBorrwed * (1 + (rate/100))

	return totalPaid 
}

double yearlyPaid(double toPay, double years){

	return toPay / years
}

double interestPaid(double totalBorrowed, double rate, double years){

	return 0
	
}



String userInput
double totalBorrowed, years, rate

println "Please enter the total amount to be borrowed: "
print ">>"
userInput = System.console().readLine()
totalBorrwed = Double.parseDouble(userInput)

println "Please enter the years over which the mortgage will be repaid: "
print ">>"
userInput = System.console().readLine()
years = Double.parseDouble(userInput)

println "Please enter the rate (assume fixed over life of mortgage): "
print ">>"
userInput = System.console().readLine()
rate = Double.parseDouble(userInput)


// Total amount to be paid test
println "Total Paid: " + totalPaid(totalBorrowed, rate, years)

// Money to be paid every year test
println "Total Paid: " + yearsPaid(totalPaid(totalBorrowed,rate,years),years)

// Time before interest is repaid



