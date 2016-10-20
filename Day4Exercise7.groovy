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


