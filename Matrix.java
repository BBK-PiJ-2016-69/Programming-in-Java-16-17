public class Matrix{
	
	public int[][] myMatrix;
	public int i,j, numberOfRows, numberOfCols;
	

	public static void main (String[] args){

		// Create new matrix of given size with all elements equal to 1
		Matrix matrixObject = new Matrix(5,5);

		// Set the element 2,4 to be 9
		matrixObject.setElement(2,4,9);

		// Set the row 3 to be equal to 2,3,7,8
		matrixObject.setRow(3,"2,3,7,8");

		// Set the col 2 to be equal to 8,8,8,8
		matrixObject.setColumn(2,"8,8,8,8");

		// To string
		System.out.println("The matrix as a string: " + matrixObject.toString());


		
	}

	public Matrix (int x, int y){
		
		this.myMatrix = new int[x][y];

		this.numberOfRows = x-1;
		this.numberOfCols = y-1;

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
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("--------------------------------TEST setCol()-------------------------------");

		System.out.println("Column at " + y + " is currently set to: ");

		for (i = 0; i < this.numberOfRows; i++){
			System.out.print(this.myMatrix[i][y]);

			if (i == this.numberOfRows-1){
				System.out.println(";");
			}
			else
			{
				System.out.print(",");
			}
		}

		System.out.println("Changing to: " + setTo);

		String[] col = setTo.split(",");
		int[] colInt = new int[col.length];

		for (i=0; i<col.length; i++){
			colInt[i] = Integer.parseInt(col[i]);
		 }

		for (i=0; i<this.numberOfRows; i++){
			this.myMatrix[i][y] = colInt[i];
		}

		System.out.println("Column at " + y + " is currently set to: ");

		for (i = 0; i < this.numberOfRows; i++){
			System.out.print(this.myMatrix[i][y]);

			if (i == this.numberOfRows-1){
				System.out.println(";");
			}
			else
			{
				System.out.print(",");
			}
		}

		System.out.println("----------------------------------------------------------------------------");
	}

	public String toString(){

		String matrixAsString = "[";
		for(i=0; i<=this.numberOfRows; i++){

			for (j=0; j<=this.numberOfCols; j++){
				matrixAsString += myMatrix[i][j];
				if(j!= this.numberOfCols){
					matrixAsString += ",";
				}
			}

			if(i!= numberOfRows){ matrixAsString += ";"; }
		}
		matrixAsString += "]";


		return matrixAsString;
	}

	public String prettyPrint(){

		String theArray = "";
		
		return theArray;
	}


}