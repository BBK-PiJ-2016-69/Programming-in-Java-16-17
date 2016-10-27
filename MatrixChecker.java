public class MatrixChecker{

	public int i;


	public static void main (String[] args){

		MatrixChecker myChecker = new MatrixChecker();

		int mySymmetricalArray[] = {1,2,3,4,3,2,1};
		System.out.println("Array is symmetrical? " + myChecker.isSymmetrical(mySymmetricalArray));

		int myOtherArray[] = {1,2,3,4,2,2,1};
		System.out.println("Array is symmetrical? " + myChecker.isSymmetrical(myOtherArray));
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
		
		return false;
	}

	boolean isTriangular(int[][] matrix){
	
		return false;	
	}

}