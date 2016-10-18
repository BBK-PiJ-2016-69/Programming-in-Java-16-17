String userInput, toParsex, toParsey
double x, y, distanceOne, distanceTwo, distanceThree, lowest
int drawCount = 0

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

// Distance from 1 to 2
// (sqrt  of (x1-x2)^2 + (y1 - y2)^2)
distanceOne = ((point1.x - point2.x)**2) + ((point1.y - point2.y)**2)
distanceOne = Math.sqrt(distanceOne)
lowest = distanceOne



// Distance from 1 to 3
distanceTwo = ((point1.x - point3.x)**2) + ((point1.y - point3.y)**2)
distanceTwo = Math.sqrt(distanceOne)
if (distanceTwo < lowest){
	lowest = distanceTwo
}


// Distance from 2 to 3
distanceThree = ((point2.x - point3.x)**2) + ((point2.y - point3.y)**2)
distanceThree = Math.sqrt(distanceOne)
if (distanceThree < lowest){
	lowest = distanceThree
}



if(distanceOne == lowest) { 
	println "Points 1 to 2"
	drawCount++

}

if(distanceTwo == lowest) { 
	if(drawCount > 0){
		println " and "
	}
	println "Points 1 to 3"
	drawCount++
}

if(distanceThree == lowest) { 
	if(drawCount > 0){
		println " and "
	}
	println "Points 2 to 3"
	drawCount++
}

println " are closest at " + lowest + " apart."



