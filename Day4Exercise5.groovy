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

	void moveTo(Point passedPoint){
		this.x = passedPoint.x
		this.y = passedPoint.y
	}

	Point clone(){
		Point returnPoint = new Point()
		returnPoint.x = this.x
		returnPoint.y = this.y

		return returnPoint
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
println "After MoveTo method, myPointOne is located at (" + myPointOne.x + "," + myPointOne.y + ")" 

// MoveTo() with Passed Point Test
println "myPointOne is located at (" + myPointOne.x + "," + myPointOne.y + ")" 
println "myPointTwo is located at (" + myPointTwo.x + "," + myPointTwo.y + ")" 
println "Moving myPointOne to same location as myPointTwo."
myPointOne.moveTo(myPointTwo)
println "After MoveTo method, myPointOne is located at (" + myPointOne.x + "," + myPointOne.y + ")" 

// Clone example
myPointThree = myPointOne.clone()
println "Cloned myPointOne to myPointThree is now located at: (" + myPointThree.x + "," + myPointThree.y + ")"
