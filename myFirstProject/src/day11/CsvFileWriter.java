package day11;

import java.io.FileWriter;
import java.io.IOException;

public class CsvFileWriter {

	public static void main(String[] args) throws IOException{
		
		String csvFileName= System.getProperty("user.dir")+ "\\data\\test.csv";
		
		FileWriter writer= new FileWriter(csvFileName);
		
		writer.append("Name,Age,Email \n");
		writer.append("John,30,john@email.com \n");
		writer.append("Smith,32,smith@email.com \n");
		writer.append("Scott,40,scott@email.com \n");
		writer.append("Alice,30,alice@email.com \n");
		writer.close();
		
		System.out.println("CSV file created at: "+ csvFileName);
	}

}
