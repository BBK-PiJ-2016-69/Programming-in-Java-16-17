String userInput, toParsex, toParsey
double x, y, width, height, area, perimeter

class Point {
double x;
double y;
}

class Rectangle {
Point upLeft;
Point downRight;
}

Rectangle rectangle = new Rectangle()
rectangle.upLeft = new Point()
rectangle.downRight = new Point()

Point testPoint = new Point()

println "Please enter the top left co-ordinate in the format x,y :"
userInput = System.console().readLine()

toParsex = userInput.charAt(0)
toParsey = userInput.charAt(2)

x = Double.parseDouble(toParsex)
y = Double.parseDouble(toParsey)

rectangle.upLeft.x = x
rectangle.upLeft.y = y

println "Please enter the bottom right co-ordinate in the format x,y :"
userInput = System.console().readLine()

toParsex = userInput.charAt(0)
toParsey = userInput.charAt(2)

x = Double.parseDouble(toParsex)
y = Double.parseDouble(toParsey)

rectangle.downRight.x = x
rectangle.downRight.y = y

println "Please enter the test co-ordinate in the format x,y :"
userInput = System.console().readLine()

toParsex = userInput.charAt(0)
toParsey = userInput.charAt(2)

x = Double.parseDouble(toParsex)
y = Double.parseDouble(toParsey)

testPoint.x = x
testPoint.y = y

if(testPoint.x < rectangle.bottomRight.x && testPoint.x > rectangle.upLeft.x && testPoint.y > rectangle.downRight.y && testPoint.y < rectangle.upLeft.y){

	println "The point is in the rectangle"
}
else
{
	println "The point is outside the rectangle"
}








