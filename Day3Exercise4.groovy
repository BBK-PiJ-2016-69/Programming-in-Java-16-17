String userInput, toParsex, toParsey
double x, y

class Point {
double x;
double y;
}

Point point1 = new Point()
Point point2 = new Point()
Point point3 = new Point()

println "Please enter point 1 in format x,y:"
userInput = System.console().readLine()

toParsex = userInput.charAt(0)
toParsey = userInput.charAt(2)

x = Double.parseDouble(toParsex)
y = Double.parseDouble(toParsey)

point1.x = x
point1.y = y

println "Please enter point 2 in format x,y:"
userInput = System.console().readLine()

toParsex = userInput.charAt(0)
toParsey = userInput.charAt(2)

x = Double.parseDouble(toParsex)
y = Double.parseDouble(toParsey)

point2.x = x
point2.y = y

println "Please enter point 3 in format x,y:"
userInput = System.console().readLine()

toParsex = userInput.charAt(0)
toParsey = userInput.charAt(2)

x = Double.parseDouble(toParsex)
y = Double.parseDouble(toParsey)

point3.x = x
point3.y = y

println "Point 1: " + point1.x + "," + point1.y
println "Point 2: " + point2.x + "," + point2.y
println "Point 3: " + point3.x + "," + point3.y

