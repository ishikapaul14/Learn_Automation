package day5;

public class prac {

	public static void main(String[] args) {
		
		int arr[]= {10,2,36,11,45};
		int max=arr[0];
		int min=arr[0];
		for(int i=1; i< arr.length; i++) {
			if(arr[i]>max)
				max= arr[i];
			if(arr[i]<min)	
				min= arr[i];
		}
		System.out.println("max="+max);
		System.out.println("min="+min);
	}

}
