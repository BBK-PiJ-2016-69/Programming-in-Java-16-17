def cards = [], suits = []
int i = 1, j = 0, skip = 0
String input

println "Please enter the cards in your hand:"
println "Numbers 1-9, J, Q, K"
println "Suits: H, C, S, D"


while (i <= 5){

	if(skip != 1){

println "Card "+ i +" (rank):"
input = System.console().readLine()


if(input != "J" && input != "Q" && input != "K"){
j = Integer.parseInt(input)
}

if (j>9 || j < 2 && input != "J" && input != "Q" && input != "K"){
	println "Error - Please enter a valid card"
}
else
{

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
}
}

println "Suit " + i


input = System.console().readLine()

if(input != "C" && input != "S" && input != "H" && input != "D")
{
	println "Please enter a valid suit"
	skip = 1
} 
else
{
	skip = 0;
	suits << input
	i++;

}

}

println "Card 1: " + cards[0]
println "Suits1: " + suits[0]
println "Card2: " + cards[1]
println "Suits2: " + suits[1]
println "Card3: " + cards[2]
println "Suits3: " + suits[2]
println "Card4: " + cards[3]
println "Suits4: " + suits[3]
println "Card5: " + cards[4]
println "Suits5: " + suits[4]