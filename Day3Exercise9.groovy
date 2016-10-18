String userInput, toPrint = ""
int letterCount = 0


// Get user input
println "Please enter your text: "
userInput = System.console().readLine()

for (i = 0; i < userInput.length(); i++) {

   if(userInput.charAt(i) == "e"){
   		letterCount++ 
   }
}

println letterCount