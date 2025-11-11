import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat df =new SimpleDateFormat("dd/mm/yyyy");//predefined format
		
		//date to string
		String strDate = df.format(d);
		System.out.println(strDate);
		
		//String to date
		Date d1;
		try {
		d1= df.parse(strDate);
		System.out.println(d1);
		} catch (ParseException e) {
			
			e.fillInStackTrace();
		}
 	}

}
