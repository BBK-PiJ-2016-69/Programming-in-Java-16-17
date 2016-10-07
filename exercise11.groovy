def cards = [], suits = [], scards = []
int i = 1, j = 0, skip = 0, max = 0, min = 15, h=0, d=0, c=0, s=0, matchrank = 0, secondrank = 0
boolean samesuit = false, consecutive = false
String input


//
// Capture the cards entered by the user
//
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
		if(10 > max) { max = 10 }
		if(10 < min) { min = 10 }
	break

	case "Q":
		cards << 11
		if(11 > max) { max = 11 }
		if(11 < min) { min = 11 }
	break

	case "K":
		cards << 12
		if(12 > max) { max = 12 }
		if(12 < min) { min = 12 }
	break

	default: 
		cards << Integer.parseInt(input)
		if(Integer.parseInt(input)>max){max = Integer.parseInt(input)}
		if(Integer.parseInt(input)<min){min = Integer.parseInt(input)}
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
	i++
}

}

//
//  Check the value of the cards
//

// BELOW LINE DOESN'T WORK YET!



p = 0
while (p < 4)
{
if (suits[p] == "C"){ c++ }
if (suits[p] == "S"){ s++ }
if (suits[p] == "H"){ h++ }
if (suits[p] == "D"){ d++ }
p++
}

if(c == 4 || s == 4 || h == 4 || d == 4)
{
	samesuit = true
}


i = 2
while (i < 13){



if (cards.count(i) > matchrank){ 

	secondrank = matchrank
	matchrank = cards.count(i)

}

if (cards.count(i) < matchrank  && cards.count(i) > secondrank){ 

		secondrank = cards.count(i)
	}

i++;
}

println secondrank + " : " + matchrank

if (max - min == 4 && matchrank == 1) { consecutive = true }

// Is it a royal flush?

if (consecutive == true && samesuit == true)
{
	println "Straight Flush"
}


// Is it a flush?

if (consecutive == false && samesuit == true)
{
	println "Flush"
}

// Is it a straight?

if (consecutive == true && samesuit == false)
{
	println "Straight"
}

// Poker
if(matchrank == 4){
	println "Poker"
}

// Full House

if(matchrank == 3 && secondrank == 2){
	println "Full House"
}

// Add in Two Pairs

// Pair

if(matchrank == 2){
	println "Pair"
}





