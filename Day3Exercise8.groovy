String userInput, toPrint = ""
int i


// Get user input
println "Please enter your text: "
userInput = System.console().readLine()

for (i = 0; i < userInput.length(); i++) {

   if(userInput.charAt(i) == " "){
   		println toPrint
   		toPrint = ""
   }
   else
   {
   		toPrint = toPrint + userInput.charAt(i)
   }
}

println toPrint