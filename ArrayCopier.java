public class ArrayCopier {

	public static void main(String[] args){

		int i = 0;

		ArrayCopier ac = new ArrayCopier();

		// Copies firstArray to secondArray

		int firstArray[] = {1,2,5,6,7,32,19};
		int secondArray[] = {1,3,5,6,6,5,4,3,3,3,3,3};

		int returnedArray[] = ac.copy(firstArray,secondArray);

		for (i = 0; i < secondArray.length ; i++){
			System.out.println(secondArray[i]);
		}
	}

	public int[] copy (int[] givenArrayOne, int[] givenArrayTwo){

		int i = 0;

		// Both arrays are the same size
		if(givenArrayOne.length == givenArrayTwo.length){

			for (i = 0; i < givenArrayOne.length ; i++){
				givenArrayTwo[i] = givenArrayOne[i];
			}
		}

		// Array to copy is larger
		else if(givenArrayOne.length > givenArrayTwo.length){

			for(i = 0 ; i < givenArrayTwo.length; i++){
				givenArrayTwo[i] = givenArrayOne[i];
			}
		}

		// Array to copy is smaller
		else if(givenArrayOne.length < givenArrayTwo.length){

			for(i = 0 ; i < givenArrayTwo.length; i++){
				if(i<=givenArrayOne.length-1){
					givenArrayTwo[i] = givenArrayOne[i];
				}
				else
				{
					givenArrayTwo[i] = 0;
				}

			}
		}

		return givenArrayTwo;

	}
}


