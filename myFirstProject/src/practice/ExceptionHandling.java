package practice;

public class ExceptionHandling {

	public static void main(String[] args) {

		try {
			int i=0, result=1;
			result= 10/i;
			System.out.println("result");
		}
		catch(Exception e){
			System.out.println("Error");
		}

	}

}
