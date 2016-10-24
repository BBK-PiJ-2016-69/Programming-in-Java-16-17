public class ArrayCopier {

	public static void main(String[] args){

		int i = 0;

		ArrayCopier ac = new ArrayCopier();
		int firstArray[] = {1,2,5,6,7,32,19};
		int secondArray[] = ac.copy(firstArray);

		for (i = 0; i < secondArray.length ; i++){
			System.out.println(secondArray[i]);
		}
	}

	public int[] copy (int[] givenArray){
		int i = 0;
		int returnArray[] = new int[givenArray.length];

		for (i = 0; i < givenArray.length ; i++){
			returnArray[i] = givenArray[i];
		}

		return returnArray;

	}
}


