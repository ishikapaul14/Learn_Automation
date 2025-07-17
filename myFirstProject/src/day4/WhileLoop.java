package day4;

public class WhileLoop {

	public static void main(String[] args) {
		
		/* syntax of while loop
		 * initialization;
		 * while(condition){
		 * statement;
		 * inc/dec;
		 * }
		 * 
		 * eg. print 1-10 no.'s
		 */
		
		/*int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		*/
		
		
		int i=1;
		while(i<=10) 
		{
			if(i%2==0) 
			{
				System.out.println(i+ "even"); 
				}
			else 
			{
				System.out.println(i+ "odd"); 
				}
		i++;
		}
		
	}

}
