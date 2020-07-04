

public class NestedFor {

	public static void main(String[] args) {
		
	
				//initialisation; loop continuation condition; incrementation
				//start, test, increment
				//i = i + 5 or i+=5
		for(int i = 1; i <= 3; i++) { // this is our row - outer loop 
			//i = 2... true ... i = 2 + 1 
			for(int j = 1; j <= 3; j++) { // this is our column - inner loop
				//j is now equal to 2 
				if(i == j) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
			
		}

	}

}