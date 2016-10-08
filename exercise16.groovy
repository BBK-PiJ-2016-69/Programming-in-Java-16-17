// Define Variables
String playerOne, playerTwo, playersHand
int playerOneWins, playerTwoWins


// Enter intial loop
while ((playerOneWins - playerTwoWins) > -4 && (playerOneWins - playerTwoWins) < 4)
{
	// Gather input
	println "Please enter the match result in the format R = Rock, P = Paper, S = Stone (e.g. RR)"
	playersHand = System.console().readLine()
	playerOne = playersHand.substring(0,1)
	playerTwo = playersHand.substring(1)

	// Calculate if draw
	if (playerOne == playerTwo){
		println "Draw"
	}

	// Calculate if playerOne is rock
	if (playerOne == "R"){
		if(playerTwo == "P")
		{
			println "Player Two Wins"
			playerTwoWins++
		}

		if(playerTwo == "S")
		{
			println "Player One Wins"
			playerOneWins++
		}

	}

	// Calculate if playerOne is paper
	if (playerOne == "P"){
		if(playerTwo == "R")
		{
			println "Player One Wins"
			playerOneWins++
		}

		if(playerTwo == "S")
		{
			println "Player Two Wins"
			playerTwoWins++
		}

	}

	// Calculate if playerOne is scissors
	if (playerOne == "S"){
		if(playerTwo == "R")
		{
			println "Player Two Wins"
			playerTwoWins++
		}

		if(playerTwo == "P")
		{
			println "Player One Wins"
			playerOneWins++
		}

	}

}

// Declare winner

if (playerOneWins > playerTwoWins){
	println "Player One Wins overall with a lead of 4"
}
else
{
	println "Player Two Wins overall with a lead of 4"
}




