String userInput, startOfNumber, endOfNumber
boolean decimal=false


println "Please enter your number to halve: "
userInput = System.console().readLine()

startOfNumber = userInput.substring(0,userInput.indexOf("."))
endOfNumber = userInput.substring(userInput.indexOf("."),userInput.length())

println "Start: " + startOfNumber
println "End: " + endOfNumber



