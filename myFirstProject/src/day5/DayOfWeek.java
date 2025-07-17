package day5;

public class DayOfWeek {

	public static void main(String[] args) {
		
		int days[]= {1,3,7,4,9};
		for(int i: days) {
			switch(i) {
			case 0:
				System.out.println("Monday");
				break;
			case 1:
				System.out.println("Tuesday");
				break;
			case 2:
				System.out.println("Wednesday");
				break;
			case 3:
				System.out.println("Thurday");
				break;
			case 4:
				System.out.println("Friday");
				break;
			case 5:
				System.out.println("Saturday");
				break;
			case 6:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Invalid");
				
			}
		}

	}

}
