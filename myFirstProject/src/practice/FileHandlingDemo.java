package practice;
import java.io.File;
import java.io.IOException;

public class FileHandlingDemo {

	public static void main(String[] args) {
		
		try {
			File file= new File(" example.txt ");
			
			//create file
			if(file.createNewFile()) {
				System.out.println("File created: "+ file.getName());
			}
			else {
				System.out.println("File already exists.");
			}
			
			//Rename file
			File renamedFile= new File("renamed_explain.txt");
			if(file.renameTo(renamedFile)) {
				System.out.println("File renamed successfully");
			}
			//delete file
			if(renamedFile.delete()) {
				System.out.println("File deleted successfully");
			}
		}
			catch(Exception e) {
				System.out.println("An error has occured");
				e.printStackTrace();
			}
		
		}
		
}
