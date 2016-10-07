int card1, card2, card3, card4, card5
String suit1, suit2, suit3, suit4, suit5, input


println "Please enter the cards in your hand:"
println "Numbers 1-9, J, Q, K"
println "Card 1 (rank):"
input = System.console().readLine()

switch(input) {
	case "J":
		card1 = 10
	break

	case "Q":
		card1 = 11
	break

	case "K":
		card1 = 12
	break

	default: 
		card1 = Integer.parseInt(input)
	break
}

println "Card One:" + card1
println "Suit:"
suit = System.console().readLine()
