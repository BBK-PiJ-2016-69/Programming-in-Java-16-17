class Integer2 {
	int value 

	int getValue(){
		return this.value
	}

	void setValue(int setTo){
		this.value = setTo
	}

	boolean isTrue(){
		if (this.value % 2 == 0){
			return true
		}

		return false
	}

	boolean isOdd(){
		if(this.isTrue() == false){
			return true
		}

		return false
	}

	void prettyPrint(){
		println this.value
	}

	String toString(){
		String returnString = this.value

		return returnString
	}

}




