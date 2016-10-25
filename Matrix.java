public class Matrix{
	
	public int i,j;
	

	public static void main (String[] args){

		Matrix matrixObject = new Matrix(3,4);
		
	}

	public Matrix (int x, int y){
		
		int[][] myMatrix = new int[x][y];

		for(i=0; i<x; i++){

			for (j=0; j<y; j++){
				myMatrix[i][j] = 1;
			}
			System.out.println("Test: " + myMatrix[1][3]);
		}
	}

	public void setElement(int x, int y, int setTo){

	}

	public void setRow(int y, String setTo){

	}

	public void setColumn(int x, String setTo){

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