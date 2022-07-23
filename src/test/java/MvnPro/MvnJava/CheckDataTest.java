package MvnPro.MvnJava;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

@SuppressWarnings("unused")
@Test
public class CheckDataTest {


	public static void data()throws IOException {
		// TODO Auto-generated method stub

		Practdatadriven ed=new Practdatadriven();
		String x=ed.getexceldata("data", "Delete", "Other");
		
		System.out.println(x);
		
	}

}
