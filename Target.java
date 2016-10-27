public class Target{

	public int i,j,k,size,x,y,z;
	public int[][][] targetMatrix;
	public boolean success = false;
	String userInput;


	public static void main (String[] args){

		Target myTarget = new Target(3);
		myTarget.init();

		while(success == false){
			System.out.print("Please enter coordinate X: ");
			userInput = System.console().readLine();
			x = Integer.parseInt(userInput);

			System.out.print("\nPlease enter coordinate Y: ");
			userInput = System.console().readLine();
			y = Integer.parseInt(userInput);

			System.out.print("\nPlease enter coordinate Z: ");
			userInput = System.console().readLine();
			z = Integer.parseInt(userInput);

			switch(myTarget.result(x,y,z)){
				case HIT: System.out.println("Hit! Well done.");

			}

		}
		myTarget.result(x,y,z)
	}


	public Target(int size){
		this.targetMatrix = new int[size][size][size];
		this.size = size;

		for(i=0; i < size; i++){
			for(j=0; j < size; j++){
				for(k=0; k < size; k++){
					targetMatrix[i][j][k] = 0;
				}
			}
		}
	}

	public void init(){
		this.x = (int)Math.abs(targetMatrix[0].length * Math.random());
		this.y = (int)Math.abs(targetMatrix[1].length * Math.random());
		this.z = (int)Math.abs(targetMatrix[2].length * Math.random());

		this.targetMatrix[this.x][this.y][this.z] = 1;
	}

	public Result result(int x, int y, int z){


		if(x > this.size || y > this.size || z > this.size){
			return Result.OUT_OF_RANGE;
		}
		else if(x > this.x){
			return Result.FAIL_LEFT;
		}
		else if (x < this.x){
			return Result.FAIL_RIGHT;
		}
		else if (y > this.y){
			return Result.FAIL_LOW;
		}
		else if (y < this.y){
			return Result.FAIL_HIGH;
		}
		else if (z > this.z){
			return Result.FAIL_LONG;
		}
		else if (z < this.z){
			return Result.FAIL_SHORT;
		}
		else if(x == this.x && y == this.y && z == this.z){
			return Result.HIT;
		}
		else
		{
			System.out.println("ERROR");
		}



		return Result.OUT_OF_RANGE;

	}

}