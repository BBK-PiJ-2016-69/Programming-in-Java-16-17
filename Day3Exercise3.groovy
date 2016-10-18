double termOne, termTwo, result
String userInput, operator

println "Please enter a mathematical operation (e.g. 4*6): "
userInput  = System.console().readLine()

userInput = userInput.replaceAll(" ","")
println userInput