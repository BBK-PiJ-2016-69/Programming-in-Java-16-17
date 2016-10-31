public class ArrayUtilities {
	

	public static void main(String[] args){

	int[] myArray = {1,2,3};
	ArrayUtilities test = new ArrayUtilities();
	List myList = test.getList(myArray);
	myList.printAll();


	}

	public static List getList (int[] givenArray){
		int i;
		List newList = new List();
		
		for(i=0; i<givenArray.length; i++){
			newList.addItem(givenArray[i]);
		}

		return newList;
	}


}