public class MatrixChecker{

	public int i,j;


	public static void main (String[] args){

		MatrixChecker myChecker = new MatrixChecker();

		int mySymmetricalArray[] = {1,2,3,4,3,2,1};
		System.out.println("Array is symmetrical? " + myChecker.isSymmetrical(mySymmetricalArray));

		int myOtherArray[] = {1,2,3,4,2,2,1};
		System.out.println("Array is symmetrical? " + myChecker.isSymmetrical(myOtherArray));

		int mySymmetricalMatrix[][] = {{1,1,1},{1,1,1},{1,1,1}};
		System.out.println("Matrix is symmetrical? " + myChecker.isSymmetrical(mySymmetricalMatrix));

		int myOtherMatrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Matrix is symmetrical? " + myChecker.isSymmetrical(myOtherMatrix));

	}

	boolean isSymmetrical(int[] matrix){

		// Ignores middle value for odd numbered array
		for(i = 0; i < matrix.length/2; i++){
			if(matrix[i]!=matrix[matrix.length-1-i]){
				return false;
			}
		}

		return true;
	}

	boolean isSymmetrical(int[][] matrix){



		for(i = 0; i < matrix[0].length; i++){
			for(j = 0; j < matrix[1].length; j++){
				if(matrix[i][j] != matrix[j][i]){	
					return false;
				}
			}
		}
		
		return true;
	}

	boolean isTriangular(int[][] matrix){
	
		return false;	
	}

}