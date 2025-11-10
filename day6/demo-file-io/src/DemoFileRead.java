import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoFileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			FileInputStream fis =null;// reference
			
			//while creating the object associate the object
			try {
				fis =new FileInputStream("readme.txt");
				System.out.println("file Found");
				int data =fis.read();
				System.out.println((char)data);
				//jaisehe end of file ayega it returns -1
				while(data !=-1) {
					System.out.print((char)data);
					data = fis.read();
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
			}
	}

}
