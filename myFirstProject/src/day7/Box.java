package day7;

public class Box {
	
	double width, height, depth;
	
	Box()   // constructor 1
	{
//		width= 0;
//		height=0;
//		depth=0;
		width=height=depth=0;
	}
	
	Box(double w, double h, double d)   //2
	{
		width=w;
		height=h;
		depth=d;
		
	}
	
	Box(double len)   //3
	{
		width=height=depth=len;
	}
	
	double volume()  //method
	{
		return(width*height*depth);
	}

}
