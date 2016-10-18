String userInput, toParsex, toParsey
double x, y

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



