package day4;

public class ForLoop {

	public static void main(String[] args) {
		
		/* for loop syntax
		 * 
		 * for (initialization, condition, inc/dec)
		 * {
		 *   statement;
		 * }
		 */
		for (int i=1; i<=10; i++)
		{
			if(i%2==0)
			{
				System.out.println(i+ "even");
			}
			else {
				System.out.println(i+"odd");
			}
		}
	}

}
