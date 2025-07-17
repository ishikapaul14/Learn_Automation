package day11;
import java.io.File;
public class FolderActions {
	
	//create folder (method)
	public static void createFolder(String folderpath) {
		File folder= new File(folderpath);
		if(!folder.exists())   // exists is a pre-existing method
		{
			folder.mkdir();    //this method creates a new folder
			System.out.println("Folder created: "+ folderpath);
		}
			
	}
	//check folder exists or not (method)
		public static boolean checkFolderExists(String folderpath) {
			File folder= new File(folderpath);
			return (folder.exists());   // exists is a pre-existing method
				
		}
	
		//rename a folder
		public static void renameFolder(String oldPath, String newPath) {
			File oldFolder= new File(oldPath);
			File newFolder= new File(newPath);
			
			if(oldFolder.exists()) {
				oldFolder.renameTo(newFolder);
				System.out.println("Folder renamed to:" +newPath);
				
			}
		}
		
		//delete folder
		public static void deleteFolder(String folderPath) {
			File folder= new File(folderPath);
			if(folder.exists()) {
				for(File file:folder.listFiles()) {
					file.delete();
				}
				
				folder.delete();
				System.out.println("Folder deleted."+ folderPath);
				
				
			}
		}
	
	
	public static void main(String[] args) {
		
		String folderpath= "C:\\Users\\ishika.paul\\Automation\\myWorkspace\\myFiles" ; 
		createFolder(folderpath);
		
		boolean folderExists= checkFolderExists(folderpath);
		System.out.println("Folder exists: "+ folderExists );
		
		String newfolderpath= "C:\\Users\\ishika.paul\\Automation\\myWorkspace\\myfiles1";
		renameFolder(folderpath, newfolderpath );
		
		deleteFolder(newfolderpath);
	}
	

}
