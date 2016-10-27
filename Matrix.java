public class Matrix{
	
	public int[][] myMatrix;
	public int i,j, numberOfRows, numberOfCols;
	

	public static void main (String[] args){

		// Create new matrix of given size with all elements equal to 1
		Matrix matrixObject = new Matrix(5,5);

		// Set the final element to be equal to 9
		matrixObject.setElement(3,4,9);

		// Set the row 3 to be equal to 2
		matrixObject.setRow(3,"2,3,7,8");


		
	}

	public Matrix (int x, int y){
		
		this.myMatrix = new int[x][y];

		for(i=0; i<x; i++){

			for (j=0; j<y; j++){
				myMatrix[i][j] = 1;
			}
		}
	}

	public void setElement(int x, int y, int setTo){

		System.out.println("----------------------------------------------------------------------------");
		System.out.println("------------------------------TEST setElement()-----------------------------");
		System.out.println("Element at " + x + "," + y + " is currently set to: " + this.myMatrix[x][y]);
		System.out.println("Changing to value: " + setTo);
		this.numberOfRows = x;
		this.numberOfCols = y;
		this.myMatrix[x][y] = setTo;
		System.out.println("Element at " + x + "," + y + " is currently set to: " + this.myMatrix[x][y]);
		System.out.println("----------------------------------------------------------------------------");
	}

	public void setRow(int x, String setTo){

		System.out.println("----------------------------------------------------------------------------");
		System.out.println("--------------------------------TEST setRow()-------------------------------");

		System.out.println("Row at " + x + " is currently set to: ");

		for (i = 0; i < this.numberOfCols; i++){
			System.out.print(this.myMatrix[x][i]);

			if (i == this.numberOfCols-1){
				System.out.println(";");
			}
			else
			{
				System.out.print(",");
			}
		}

		System.out.println("Changing to: " + setTo);

		String[] row = setTo.split(",");
		int[] rowInt = new int[row.length];

		for (i=0; i<row.length; i++){
			rowInt[i] = Integer.parseInt(row[i]);
		 }

		for (i=0; i<this.numberOfCols; i++){
			this.myMatrix[x][i] = rowInt[i];
		}

		System.out.println("Row at " + x + " is currently set to: ");

		for (i = 0; i < this.numberOfCols; i++){
			System.out.print(this.myMatrix[x][i]);

			if (i == this.numberOfCols-1){
				System.out.println(";");
			}
			else
			{
				System.out.print(",");
			}
		}

		System.out.println("----------------------------------------------------------------------------");

	}

	public void setColumn(int y, String setTo){

	}

	public String toString(){

		String theArray = "";

		return theArray;
	}

	public String prettyPrint(){

		String theArray = "";
		
		return theArray;
	}


}