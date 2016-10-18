String userInput, user, domain
boolean validCommand = false, quit = false

println "Welcome to my mailserver"

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
				
				user = userInput.substring(userInput.indexOf(":")+1,userInput.indexOf("@"))
				domain = userInput.substring(userInput.indexOf("@")+1,userInput.length())

				if(user.length()>0 && domain.length()>0 && user.charAt(0)!= " " && user.charAt(0)!= " "){
					println "Mail from: " + user + " at " + domain
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