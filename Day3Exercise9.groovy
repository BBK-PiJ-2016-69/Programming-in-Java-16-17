String userInput,searchLetter
int letterCount = 0


// Get user input
println "Please enter your text: "
userInput = System.console().readLine()

println "Please enter the letter for which to search: "
searchLetter = System.console().readLine()

for (i = 0; i < userInput.length(); i++) {

   if(userInput.charAt(i) == searchLetter){
   		letterCount++ 
   }
}

println letterCount