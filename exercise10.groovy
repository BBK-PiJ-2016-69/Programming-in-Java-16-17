def cards = [], suits = [], scards = []
int i = 1, j = 0, skip = 0, max = 0, min = 15, h=0, d=0, c=0, s=0
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

if (max - min == 4) { consecutive = true }


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



// Is it a royal flush?

if (consecutive == true && samesuit == true)
{
	println "Royal Flush"
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



