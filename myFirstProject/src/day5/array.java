package day5;

public class array {
	
	public static void main(String args[]) {
		
//		String cars[]= {"Volvo","Ford","BMW","Mazada"};
//		cars[0]="Opel";
//		System.out.println(cars[0]+" "+ cars.length);
		
		// for loop
//		String cars[]= {"Volvo","Ford","BMW","Mazada"};
//		for(int i=0;i<cars.length;i++) {
//			System.out.println(cars[i]);
//			}
		
		// for-each loop syntax- for (type variable : arrayname) {...}
//		String cars[]= {"Volvo","Ford","BMW","Mazada"};
//		for (String i: cars){
//			System.out.println(i);
//		}
		
		// example: sum and average
		int ages[]= {20, 25, 17, 30, 70};
		float avg, sum=0;
		for (int i: ages){
			sum+=i;
		}
		 avg= sum/ages.length ;
		 System.out.println(avg);
		 
		 // example: lowest no in an array
		 int[] age= {20, 22, 18, 35, 48, 26, 87, 70};
		 int length= age.length;
		 int lowestage= age[0];
		 for(int i:age) {
			 if(lowestage>i)
				 lowestage= i;
		 }
		 System.out.println(lowestage);
		 
	}
}
