String userInput, toParsex, toParsey
double x, y, distanceOne, distanceTwo, distanceThree

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

// Distance from 1 to 2
// (sqrt  of (x1-x2)^2 + (y1 - y2)^2)
distanceOne = ((point1.x - point2.x)**2) + ((point1.y - point2.y)**2)
distanceOne = Math.sqrt(distanceOne)


// Distance from 1 to 3
distanceTwo = ((point1.x - point3.x)**2) + ((point1.y - point3.y)**2)
distanceTwo = Math.sqrt(distanceOne)

// Distance from 2 to 3
distanceThree = ((point2.x - point3.x)**2) + ((point2.y - point3.y)**2)
distanceThree = Math.sqrt(distanceOne)

println distanceOne
println distanceTwo
println distanceThree



