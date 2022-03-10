import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {
	
	public static void fileHandling(){
		mainFunction menu=new mainFunction();
		Scanner input1=new Scanner(System.in);
		while(true) {
		
			
			System.out.println("Enter 1 for creating a new file");
			System.out.println("Enter 2 for deleting an existing file");
			System.out.println("Enter 3 for searching a new file");
			System.out.println("Enter 4 for going back to the main menu");
			
			int value=input1.nextInt();
			switch(value)
			{
			case 1:
				createFile();
				break;
			case 2:
				deleteFile();
				break;
			case 3:
				searchFile();
				break;
			case 4:
				System.out.println("Going back to main menu");
				menu.main(null);
			default:
				System.out.println("Please enter a value between 1 and 3");
				break;
			}
			
		
		}
	}

	public static void searchFile() {
		Scanner input2=new Scanner(System.in);
		System.out.println("Enter the name of the file to be searched");
		String fileName=input2.nextLine();
	     fileName=fileName+ ".txt";
		
			File file=new File("C:\\File operations\\" +fileName);
			if(file.exists())
			{
				System.out.println("file exists");
			}
			else {
				System.out.println("file does not exist");
			}
		
		
	}

	public static void deleteFile() {
		Scanner input2=new Scanner(System.in);
		System.out.println("Enter the name of the file to be deleted");
		String fileName=input2.nextLine();
	     fileName=fileName+ ".txt";
		
			File file=new File("C:\\File operations\\" +fileName);
			
			if(file.delete())
				
				{
					System.out.println("file successfully deleted");
	}
				else {
					System.out.println("file does not exist");
				}
			} 
			
		
	
public static void createFile() {
	
	Scanner input2=new Scanner(System.in);
	System.out.println("Enter the name of the file to be created");
	String fileName=input2.nextLine();
     fileName=fileName+ ".txt";
	
		File file=new File("C:\\File operations\\" +fileName);
		try {
			if(file.createNewFile())
			
			{
				System.out.println("File successfully created");
}
			else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
return;
}
}

