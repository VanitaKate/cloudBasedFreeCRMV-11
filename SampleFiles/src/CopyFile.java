import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

   public static void main(String args[]) throws IOException  {  
	//File src=new File("D:\\Input.txt");
    FileInputStream fis=null;
	try {
		fis = new FileInputStream("E:\\Input.txt");
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    FileOutputStream fos=null;
	try {
		fos = new FileOutputStream("E:\\Output.txt");
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    int c;
    try {
		while ((c= fis.read())!=-1) {
			fos.write(c);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
    if (fis!=null){
		fis.close();
	}
    if (fos!=null) {
    	fos.close();}
    }
    
    
   }
}
