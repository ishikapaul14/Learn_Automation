package day7;

public class Student {
	
	//class variables
	int sid;
	String sname;
	char grad;
	
	void printStudentData()
	{
		System.out.println(sid+" "+sname+" "+grad);
	}
	void setStudentData(int id, String name, char gr )
	{
		//local variables
		sid= id;
		sname= name;
		grad= gr;
	}
	Student(int id, String name, char gr) // constructor- no return- can take parameters-same name as class
	{
		sid= id;
		sname= name;
		grad= gr;
	}
}
