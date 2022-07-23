package MvnPro.MvnJava;

import org.apache.logging.log4j.*;

public class log4jTest2 {
	
	private static Logger log= LogManager.getLogger(log4jTest2.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("Logging Debug");
		
		log.error("Logging Error");
		
		log.info("This is Info");
		
		log.fatal("This is fatal");

		
		
	}

}
