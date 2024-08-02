package genaric.Library;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
/**
 * this is a class contains with all java related generic functions
 */
public class JavaLibrary {
	/**
	 * this method is used to create random numbers
	 * @param bound
	 * @return
	 */
	public int generateRandomnumber(int bound) {
	Random r=new Random();
	int num=r.nextInt(bound);
	return num;
	}
   /**
    * this is a generic method to handle calender
    * @param formatType
    * @return
    */
	public String calenderHandling(String formatType) {
		Calendar cal=Calendar.getInstance();
		Date d=cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat(formatType);
		String date=sdf.format(d);
		return date;
	}
}
