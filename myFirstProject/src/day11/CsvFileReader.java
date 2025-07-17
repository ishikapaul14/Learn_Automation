package day11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CsvFileReader {

	public static void main(String[] args) throws IOException {
		
		//Approach1: using Scanner class
		/*
		File file= new File(System.getProperty("user.dir")+ "\\data\\test.csv");
		
		Scanner sc= new Scanner(file);
		
		sc.useDelimiter(",");
		
		while(sc.hasNext()) {
			System.out.print(sc.next()+"\t");
		}
		sc.close();
		*/
		
		//Approach 2
		
		String csvFileName=System.getProperty("user.dir")+ "\\data\\test.csv";
		FileReader reader= new FileReader(csvFileName);
		
		BufferedReader bfreader= new BufferedReader(reader);
		
		String line;
		
		while((line= bfreader.readLine())!= null) {
			String[] data= line.split(",");
			for(String value: data) {
				System.out.print(value+ "\t");
			}
		
		System.out.println();
		}
	}
	
}
