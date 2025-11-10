import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		FileInputStream fis =null;
		FileOutputStream fos = null;
		try {
			fis =new FileInputStream("readme.txt");
			System.out.println("FileCopy Found");
			fos = new FileOutputStream("create.txt"); 
			int data =fis.read();
					System.out.println((char)data);
			while(data !=-1) {
//			System.out.print((char)data);/
			fos.write(data);
			data =fis.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	} 
	

}





