String userInput, fromUser, fromDomain, toUser, toDomain
boolean validCommand = false, quit = false

println "Welcome to my mailserver"


// Get the mail from command or quit
while (validCommand == false){
	print ">>> "
	userInput = System.console().readLine()

	if(userInput.substring(0,4) == "QUIT"){
		quit = true
		println "QUIT"
		validCommand = true
 	}

 	if(userInput.length() > 10){

		if(userInput.substring(0,10) == "MAIL FROM:"){

			if(userInput.indexOf("@")!=-1){
				
				fromUser = userInput.substring(userInput.indexOf(":")+1,userInput.indexOf("@"))
				fromDomain = userInput.substring(userInput.indexOf("@")+1,userInput.length())

				if(fromUser.trim().length()>0 && fromDomain.trim().length()>0){
					println "OK"
					validCommand = true
				}
				else
				{
					println "Invalid user or domain"
				}
			}
			else
			{
				println "Invalid Command"
			}
 		}
 		else
 		{
 			println "Invalid Command"
 		}
	}
	else
	{
		println "Invalid Command"
	}

}

$validCommand = false
