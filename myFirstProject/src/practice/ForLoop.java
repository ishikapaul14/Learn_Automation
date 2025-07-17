package practice;

public class ForLoop {

	public static void main(String[] args) {
		
		int[] numbers= {10,25,40,77,34};
		int target= 30;
		
		boolean found = false;
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]== target) {
				found =true;
				System.out.println("The number "+ target+"is found at index "+ i);
				break;
			}
		
		else {
			System.out.println("The number was not found");
			break;
		}
		}

	}

}
