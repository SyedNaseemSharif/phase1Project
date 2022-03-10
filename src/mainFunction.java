import java.io.File;
import java.util.Scanner;


public class mainFunction {

	public static void main(String[] args) {
		File dir=new File("C:\\File operations\\");
		dir.mkdir();
	
	System.out.println("Lockers Pvt. Ltd.");
     System.out.println("Welcome to LockedMe.com");
     System.out.println("Developed by Syed Naseem Sharif");
     while(true)
     {
    	 
    	 System.out.println("Enter 1 if you would like to retrieve the files from the directory");
    	 System.out.println("Enter 2 if you would like to perform Business operations on the files");
    	 System.out.println("Enter 3 if you would like to close the application");
    	 System.out.println("Please select one of the 3 options based on your requirement");
    	 Scanner input=new Scanner(System.in);
    	 int Case=input.nextInt();
    	 listFile list=new listFile();
    	 fileHandling Handling=new fileHandling();
    	 switch(Case)
    	 {
    	 case 1:		
    		 list.listFile();
    		 break;
    	 case 2:
    		 System.out.println("Performing file operations");
    		 Handling.fileHandling();
    		 break;
    	 case 3:
    		 System.out.println("Closing the application");
    		 System.exit(3);
    	default :
    		System.out.println("Please enter a value between 1 and 3");
    		break;
    	
    	 }
    	
    	}
	}
}
