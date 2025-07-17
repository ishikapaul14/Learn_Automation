package day5;

public class multi_di_array {

	public static void main(String[] args) {
		
//		int[][] no= {{1,2,3},{4,5,6},{7,8,9}};
//		System.out.println(no[1][2]);
//		no[1][2]=10;
//		System.out.println(no[1][2]);
		
		// printing the entire array
//		int[][] no= {{1,2,3},{4,5,6},{7,8,9}};
//		for(int i=0;i<no.length;++i) {
//			for(int j=0;j<no[i].length; ++j)
//				System.out.println(no[i][j]);
//		}
//		
//		int[][] myNumbers = { {1, 2, 6, 4}, {5, 6, 9} };
//		for (int[] row : myNumbers) {
//		  for (int i : row) {
//		    System.out.println(i);
//		  }
//		}
		
		int[] arr= {1,2,3,4,5,6};
		int x=10; 
		boolean found= false;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==x)
				found= true;
			break;
		}
		if(found) 
			System.out.println("yes "+x+" is present in the array");
		else
			System.out.println("no "+x+" is not present in the array");
	}

}
