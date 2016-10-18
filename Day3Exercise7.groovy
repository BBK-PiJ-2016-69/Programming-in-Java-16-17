String userInput, toParsex, toParsey
double x, y, width, height, area, perimeter
boolean insideOne, insideTwo

class Point {
double x;
double y;
}

class Rectangle {
Point upLeft;
Point downRight;
}


// Set up rectangle one
Rectangle rectangleOne = new Rectangle()
rectangleOne.upLeft = new Point()
rectangleOne.downRight = new Point()

// Set up rectangle two
Rectangle rectangleTwo = new Rectangle()
rectangleTwo.upLeft = new Point()
rectangleTwo.downRight = new Point()

Point testPoint = new Point()

// Input for rectangle one

println "Please enter the top left co-ordinate of rectange 1 in the format x,y :"
userInput = System.console().readLine()

toParsex = userInput.charAt(0)
toParsey = userInput.charAt(2)

x = Double.parseDouble(toParsex)
y = Double.parseDouble(toParsey)

rectangleOne.upLeft.x = x
rectangleOne.upLeft.y = y

println "Please enter the bottom right co-ordinate of rectange 1 in the format x,y :"
userInput = System.console().readLine()

toParsex = userInput.charAt(0)
toParsey = userInput.charAt(2)

x = Double.parseDouble(toParsex)
y = Double.parseDouble(toParsey)

rectangleOne.downRight.x = x
rectangleOne.downRight.y = y

// Input for rectangle two

println "Please enter the top left co-ordinate of rectange 2 in the format x,y :"
userInput = System.console().readLine()

toParsex = userInput.charAt(0)
toParsey = userInput.charAt(2)

x = Double.parseDouble(toParsex)
y = Double.parseDouble(toParsey)

rectangleTwo.upLeft.x = x
rectangleTwo.upLeft.y = y

println "Please enter the bottom right co-ordinate of rectange 2 in the format x,y :"
userInput = System.console().readLine()

toParsex = userInput.charAt(0)
toParsey = userInput.charAt(2)

x = Double.parseDouble(toParsex)
y = Double.parseDouble(toParsey)

rectangleTwo.downRight.x = x
rectangleTwo.downRight.y = y



println "Please enter the test co-ordinate in the format x,y :"
userInput = System.console().readLine()

toParsex = userInput.charAt(0)
toParsey = userInput.charAt(2)

x = Double.parseDouble(toParsex)
y = Double.parseDouble(toParsey)

testPoint.x = x
testPoint.y = y

if(testPoint.x < rectangleOne.downRight.x && testPoint.x > rectangleOne.upLeft.x && testPoint.y > rectangleOne.downRight.y && testPoint.y < rectangleOne.upLeft.y){
	insideOne = true
}

if(testPoint.x < rectangleTwo.downRight.x && testPoint.x > rectangleTwo.upLeft.x && testPoint.y > rectangleTwo.downRight.y && testPoint.y < rectangleTwo.upLeft.y){
	insideTwo = true
}

if(insideOne == true && insideTwo == true){
	println "The point is inside both rectangles"
}

else if(insideOne == true){
	println "The point is inside rectangle one"
}
else if(insideTwo == true){
	println "The point is inside rectangle two"
}
else
{
	println "The point is not inside either rectangle"
}









