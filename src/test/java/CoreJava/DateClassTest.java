package CoreJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

final public class DateClassTest {

	public static void main(String[] args) {


	Date d =new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("MM-yyy/dd");
	
System.out.println(sdf.format(d));

Calendar as = Calendar.getInstance();


System.out.println(as.get(Calendar.DAY_OF_MONTH));
System.out.println(as.get(Calendar.ERA));
	}

}
