import java.io.File;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.stream.Stream;

public class listFile{
	
	public static void listFile() {
		
		File path=new File("C:\\File operations");
		String[] contents= path.list();
		System.out.println("Showing list of files in the directory");
	if(contents.length>0)
	{
		for(int i=0;i<contents.length;i++)
		{
			System.out.println(contents[i]);
		}
		
	}
	else
	{
		System.out.println("folder is empty");
		
	}
	
}
}