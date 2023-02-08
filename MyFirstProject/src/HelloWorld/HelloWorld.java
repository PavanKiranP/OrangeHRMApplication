package HelloWorld;

import java.util.Calendar;
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		
		
		System.out.println("&&&&&&&&&&&&  Hello World  &&&&&&&&&&&");

		//Time Stamp
		 Calendar cal = Calendar.getInstance();
	        Date Time = cal.getTime();
	        System.out.println(Time); 
	}

}
