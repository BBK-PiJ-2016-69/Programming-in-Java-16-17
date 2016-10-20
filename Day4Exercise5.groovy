class Point {
	double x
	double y 

	double distanceTo(Point passedPoint){
		double distance = ((this.x - passedPoint.x)**2) + ((this.y - passedPoint.y)**2)
		distance = Math.sqrt(distance)

		return distance
	}	

	double distanceToOrigin(){
		Point origin = new Point()
		origin.x = 0
		origin.y = 0

		return distanceTo(origin)
	}

	void moveTo(double x, double y){
		this.x = x
		this.y = y
	}
}



// Declare Points
Point myPointOne = new Point()
myPointOne.x = 10
myPointOne.y = 12

Point myPointTwo = new Point()
myPointTwo.x = 12
myPointTwo.y = 14

// DistanceTo() Test
println "The distance between points is " + Math.abs(myPointOne.distanceTo(myPointTwo))
println "This is equivalent to: " + Math.abs(myPointTwo.distanceTo(myPointOne))


// DistanceToOrigin() Test
println "The distance from myPointOne to origin is " + myPointOne.distanceToOrigin()
println "The distance from myPointTwo to origin is " + myPointTwo.distanceToOrigin()

// MoveTo() Test
println "myPointOne is located at (" + myPointOne.x + "," + myPointOne.y + ")" 
myPointOne.moveTo(1,2)
println "After MoveTo, myPointOne is located at (" + myPointOne.x + "," + myPointOne.y + ")" 

