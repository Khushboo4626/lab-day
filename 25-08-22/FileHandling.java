package firstproject.bankapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling  {

	
	public static void main(String[] args) throws IOException {
		//main method
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of your file");
		String name = sc.next();
		File f1 = new File("C:programfiles");
		
		if(f1.createNewFile())
		{
			System.out.println("file is created sucessfully\nfile name : ");
			int choice =0;
			while (choice < 5) {
				System.out.println("Enter choice:\n1 - Edit \n2 - Read \n3 - Exit ");
				choice = sc.nextInt();
				
				switch(choice) {
					
				case 1 : System.out.println("enter: ");
						String content = sc.next();
						FileHandling.fileWrite(f1, content);// Calling method to edit file
				break;
				
				case 2 : FileHandling.fileRead(f1);// Calling to read 
				break;
				
				default : System.out.println("closing file\nfile is closed");
					System.exit(0);
				}
				
				 
			}
			
		}
		else {
			System.out.println("file already existed");
		}
		// closing Scanner Object
		sc.close();
	}
	
	public static void fileWrite(File f1,String content) throws IOException {
		String path = f1.getAbsolutePath();
		FileWriter writer = new FileWriter(path);
		writer.write(content);// Storing content 
		System.out.println("edit sucessfully\n");
		writer.close();//closing object
		
	}
	public static void fileRead(File f1) {
		try {     
            Scanner Reader = new Scanner(f1); //creating object
            System.out.println("\n"+f1.getName()+" Opening file : \n");
        
            while (Reader.hasNextLine()) {  
                String fileData = Reader.nextLine();  
                System.out.println(fileData);  
            }  
         
            Reader.close();//closing object
        } catch (FileNotFoundException exception) {  
            System.out.println("file not exist");  
            exception.printStackTrace();  
        }  
	}
}
