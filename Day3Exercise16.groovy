String userInput, startOfNumber, endOfNumber
boolean decimal=false
int beforeDecimal, afterDecimal


println "Please enter your number to halve: "
userInput = System.console().readLine()

startOfNumber = userInput.substring(0,userInput.indexOf("."))
endOfNumber = userInput.substring(userInput.indexOf(".")+1,userInput.length())


println "Start: " + startOfNumber
println "End: " + endOfNumber


beforeDecimal = Integer.parseInt(startOfNumber)
afterDecimal = Integer.parseInt(endOfNumber)

beforeDecimal = beforeDecimal / 2
afterDecimal = afterDecimal / 2

println "Half of " + userInput + " is " + beforeDecimal + "." + afterDecimal


