package day11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileActions {
	
	//creating a file
	public static void createFile(String filePath) {
		File myObj= new File(filePath);
		try {
			if(myObj.createNewFile()) {
				System.out.println("File created:" + myObj.getName());
			}
			else {
				System.out.println("File already exists");
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	// writing data into a file
	public static void writeFile(String filePath) {
		try {
		FileWriter mywriter= new FileWriter(filePath);
		
		mywriter.write("welcome");
		mywriter.close();
		System.out.println("Successfully wrote the file");
		}
		catch(Exception e){
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		String filePath="C:\\Users\\ishika.paul\\Automation\\myWorkspace\\myfile.txt";
		createFile(filePath);
		writeFile(filePath);
		
	}

}
