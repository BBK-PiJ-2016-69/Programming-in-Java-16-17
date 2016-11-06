public class IntegerTreeNode {
	int value;
	IntegerTreeNode left;
	IntegerTreeNode right;

	public IntegerTreeNode(int value){
		this.value = value;
	}


	public void strAll(IntegerTreeNode node){

		System.out.println(node.value);
		if(node.left != null){
			System.out.println("Branch Left");
			strAll(node.left);
		}

		if(node.right!= null){
			System.out.println("Branch Right");
			strAll(node.right);
		}
	}

	public void add(int newNumber) {
		
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber);
			}
		}	
	}

	public boolean contains(int n) {
		if (n == this.value) {
			return true;
		} else if (n > this.value) {
			if (right == null) {
				return false;
			} else {
				return right.contains(n);
			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.contains(n);
			}
		}
	}

	public int getMax(){
		IntegerTreeNode node = this;
		while(node.right!= null){
			node = node.right;
		}
		return node.value;
			
		
	}

	public int getMin(){
		IntegerTreeNode node = this;
		while(node.left!= null){
			node = node.left;
		}
		return node.value;
	}

}