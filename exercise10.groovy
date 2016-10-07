def cards = [], suits = []


println "Please enter the cards in your hand:"
println "Numbers 1-9, J, Q, K"
println "Suits: H, C, S, D"
println "Card 1 (rank):"


if(input != "J" && input !="K" && input != "Q")
{

	Println "Error please enter a valid code"
}
else
{
input = System.console().readLine()

switch(input) {
	case "J":
		cards << 10
	break

	case "Q":
		cards << 11
	break

	case "K":
		cards << 12
	break

	default: 
		cards << Integer.parseInt(input)
	break
}


println "Suit:"
suit1 = System.console().readLine()
}
