package day4;

public class SwitchCase {

	public static void main(String[] args) {

		/* Syntax of switch case
		 * switch(variable)
		 * {
		 * case1:statement; break;
		 * case2:statement; break;
		 * case3:statement; break;
		 * default:statement
		 * }
		 */
		int weekno=1;
		switch(weekno) 
		{
		case 1: System.out.println("sunday"); break;
		case 2: System.out.println("monday"); break;
		case 3: System.out.println("tuesday"); break;
		case 4: System.out.println("wednesday"); break;
		case 5: System.out.println("thursday"); break;
		case 6: System.out.println("friday"); break;
		case 7: System.out.println("saturday"); break;
		default : System.out.println("invalid");
		}
	}

}
