class Point {
	double x
	double y 

	double distanceTo(Point passedPoint){
		double distance = ((this.x - passedPoint.x)**2) + ((this.y - passedPoint.y)**2)
		distance = Math.sqrt(distance)
	}	
}




Point myPointOne = new Point()
myPointOne.x = 10
myPointOne.y = 12

Point myPointTwo = new Point()
myPointOne.x = 12
myPointOne.y = 14

println "The distance between points is " + Math.abs(myPointOne.distanceTo(myPointTwo))
println "This is equivalent to: " + Math.abs(myPointTwo.distanceTo(myPointOne))
